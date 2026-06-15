package hibernate.address.serviceImple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import hibernate.address.service.CreateAddressService;
import hibernate.hibernate.mapping.dbconnection.DBConnection;
import hibernate.hibernate.mapping.entity.Address;

public class CreateAddressServiceImple implements CreateAddressService{

	@Override
	public void addData() {
		// TODO Auto-generated method stub
		  EntityManager eManager =  DBConnection.dbCon().createEntityManager();

	        eManager.getTransaction().begin();

	        Scanner scanner = new Scanner(System.in);

	        Address a1 = new Address();

	        System.out.println("Enter Flat No");
	        a1.setFlatno(scanner.next());

	        System.out.println("Enter Area");
	        a1.setArea(scanner.next());

	        System.out.println("Enter Town");
	        a1.setTown(scanner.next());

	        System.out.println("Enter City");
	        a1.setCity(scanner.next());

	        System.out.println("Enter Pincode");
	        a1.setPincode(scanner.nextInt());

	        System.out.println("Enter State");
	        a1.setState(scanner.next());

	        System.out.println("Enter Country");
	        a1.setCountry(scanner.next());

	        eManager.persist(a1);

	        eManager.getTransaction().commit();

	        System.out.println("Address Inserted");
	    
		
	}

	
	
}
