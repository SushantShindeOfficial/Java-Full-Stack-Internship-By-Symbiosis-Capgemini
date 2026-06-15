package hibernate.address.serviceImple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import hibernate.address.service.DeleteAddressService;
import hibernate.hibernate.mapping.dbconnection.DBConnection;
import hibernate.hibernate.mapping.entity.Address;

public class DeleteAddressServiceImple implements DeleteAddressService{

	@Override
	public void DeleteData() {
		// TODO Auto-generated method stub
		EntityManager eManager = DBConnection.dbCon().createEntityManager();

        eManager.getTransaction().begin();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Address Id");

        int id = scanner.nextInt();

        Address a1 = eManager.find(Address.class, id);

        if (a1 != null) {

            eManager.remove(a1);

            eManager.getTransaction().commit();

            System.out.println("Address Deleted");

        } else {

            System.out.println("Address Not Found");
        }
	}
	
	
}
