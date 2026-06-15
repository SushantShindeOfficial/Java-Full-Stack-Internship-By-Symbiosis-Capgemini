
package hibernate.address.serviceImple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import hibernate.address.service.UpdateAddressService;
import hibernate.hibernate.mapping.dbconnection.DBConnection;
import hibernate.hibernate.mapping.entity.Address;
public class UpdateAddressServiceImple implements UpdateAddressService{

	@Override
	public void UpdateData() {
		// TODO Auto-generated method stub
		EntityManager eManager = DBConnection.dbCon().createEntityManager();

        eManager.getTransaction().begin();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Address Id");

        int id = scanner.nextInt();

        Address a1 = eManager.find(Address.class, id);

        if (a1 != null) {

            System.out.println("Enter City");
            a1.setCity(scanner.next());

            System.out.println("Enter State");
            a1.setState(scanner.next());

            System.out.println("Enter Country");
            a1.setCountry(scanner.next());

            eManager.merge(a1);

            eManager.getTransaction().commit();

            System.out.println("Address Updated");

        } else {

            System.out.println("Address Not Found");
        }
		
	}
	
}
