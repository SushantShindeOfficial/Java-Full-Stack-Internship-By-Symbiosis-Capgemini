package hibernate.company.serviceImple;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import hibernate.company.service.FetchCompanyService;
import hibernate.hibernate.mapping.dbconnection.DBConnection;
import hibernate.hibernate.mapping.entity.Company;

public class FetchCompanyServiceImple
        implements FetchCompanyService {


	@Override
	public List<Company> FetchData() {
		
		// TODO Auto-generated method stub
		EntityManager eManager =
                DBConnection.dbCon().createEntityManager();

        Query q = eManager.createQuery("from Company");

        List<Company> list = q.getResultList();

        return list;
		
	}
}