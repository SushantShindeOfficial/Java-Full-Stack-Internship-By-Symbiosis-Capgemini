package cc1.hpc.demo.serviceImple;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import javax.persistence.EntityManager;

import cc1.hpc.demo.dbconnection.Dbconnection;
import cc1.hpc.demo.entity.Employee;
import cc1.hpc.demo.service.CreateService;

public class CreateServiceImple implements CreateService {

	@Override
	public void addData() throws ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		EntityManager eManager=Dbconnection.dbCon().createEntityManager();
		eManager.getTransaction().begin();
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Product Id");
			int id=scanner.nextInt();
			
			System.out.println("Enter Product name ");
			String name=scanner.next();
			
			System.out.println("Enter Product Price ");
			float price=scanner.nextFloat();
			
			System.out.println("Enter Product category ");
			String category=scanner.next();
			
			System.out.println("Enter Product Description ");
			String desc=scanner.next();
			
			Employee e1=new Employee();
			e1.setId(id);
			e1.setName(name);
			e1.setPrice(price);
			e1.setCategory(category);
			e1.setDesc(desc);
			eManager.persist(e1);
		}
		eManager.getTransaction().commit();
		System.out.println("Data Inserted");
		
	}

}
