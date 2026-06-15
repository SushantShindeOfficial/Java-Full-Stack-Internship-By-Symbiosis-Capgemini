package moto.cc2.java.demo.serivrceImple;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import moto.cc2.java.demo.dbconnection.DBConnection;
import moto.cc2.java.demo.entity.Product;
import moto.cc2.java.demo.service.FetchAllService;

public class FetchAllServiceImple implements FetchAllService{

	@Override
	public void getAlldata() {
		// TODO Auto-generated method stub
		EntityManager eManager=new DBConnection().dbCon().createEntityManager();
		Query query=eManager.createQuery("select p from Product");
		List<Product> l1=query.getResultList();
		System.out.println(l1);
		
	}

}
