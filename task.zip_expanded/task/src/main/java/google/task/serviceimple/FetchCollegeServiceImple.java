package google.task.serviceimple;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import google.task.dbconnection.DbConnection;
import google.task.entity.College;
import google.task.service.FetchCollegeService;

public class FetchCollegeServiceImple implements FetchCollegeService{

	@Override
	public List<College> getCollege() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();

		String jpql = "select s from College s";

		Query q1 = em.createQuery(jpql);

		List<College> l1 = q1.getResultList();
		System.out.println(l1);

		return l1;
	}

}
