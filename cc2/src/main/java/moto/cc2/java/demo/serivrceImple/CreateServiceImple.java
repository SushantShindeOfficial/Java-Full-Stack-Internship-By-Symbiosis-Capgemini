package moto.cc2.java.demo.serivrceImple;

import java.util.Scanner;

import javax.persistence.EntityManager;
import moto.cc2.java.demo.dbconnection.DBConnection;
import moto.cc2.java.demo.entity.Product;
import moto.cc2.java.demo.service.CreateService;

public class CreateServiceImple implements CreateService{

	@Override
	public void addData() {
		// TODO Auto-generated method stub
		EntityManager eManager=DBConnection.dbCon().createEntityManager();
		eManager.getTransaction().begin();
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Employee Id");
			int id=scanner.nextInt();
			
			System.out.println("Enter name ");
			String name=scanner.next();
			
			System.out.println("Enter Price ");
			float price=scanner.nextFloat();
			
			System.out.println("Enter category ");
			String category=scanner.next();
			
			System.out.println("Enter Description ");
			String desc=scanner.next();
			
			Product e1=new Product();
			e1.setId(id);
			e1.setName(name);
			e1.setPrice(price);
			e1.setCategory(category);
			e1.setDescription(desc);
			eManager.persist(e1);
		}
		eManager.getTransaction().commit();
		System.out.println("Data Inserted");
		
	}

}
