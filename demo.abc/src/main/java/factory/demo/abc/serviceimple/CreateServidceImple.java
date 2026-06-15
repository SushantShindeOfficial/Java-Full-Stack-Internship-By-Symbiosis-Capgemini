package factory.demo.abc.serviceimple;

import javax.persistence.EntityManager;

import factory.demo.abc.dbconnection.DBConnection;
import factory.demo.abc.service.CreateService;

public class CreateServidceImple implements CreateService{

	@Override
	public void addData() {
		// TODO Auto-generated method stub
		EntityManager eManager=DBConnection.dbconn().createEntityManager();
		eManager.getTransaction().begin();
		
		
		eManager.getTransaction().commit();
		System.out.println("Service is Created");
		
	}

}
