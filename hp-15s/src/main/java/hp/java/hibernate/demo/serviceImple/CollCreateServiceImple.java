package hp.java.hibernate.demo.serviceImple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import hp.java.hibernate.demo.dbconnection.DBConnection;
import hp.java.hibernate.demo.entity.College;
import hp.java.hibernate.demo.service.CollCreateService;

public class CollCreateServiceImple implements CollCreateService {

	@Override
	public void addData() {
		// TODO Auto-generated method stub
		
		EntityManager eManager=DBConnection.dbCon().createEntityManager();
		eManager.getTransaction().begin();
		Scanner scanner = new Scanner(System.in);
		
			
			College c1=new College();
//			c1.setCity();
		eManager.getTransaction().commit();
		System.out.println("Data Inserted");
		
	}

}


