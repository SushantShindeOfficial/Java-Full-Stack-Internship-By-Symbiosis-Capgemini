package hibernate.address.serviceImple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import hibernate.address.service.FetchAddressService;
import hibernate.hibernate.mapping.dbconnection.DBConnection;
import hibernate.hibernate.mapping.entity.Address;
public class FetchAddressServiceImple implements FetchAddressService{

	@Override
	public void FetchData() {
		// TODO Auto-generated method stub
		EntityManager em = DBConnection.dbCon().createEntityManager();

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Address Id");

        int id = s1.nextInt();

        Address a1 = em.find(Address.class, id);

        if (a1 != null) {

            System.out.println(a1);

        } else {

            System.out.println("Address Not Found");
        }
	}

	
	
	
}
