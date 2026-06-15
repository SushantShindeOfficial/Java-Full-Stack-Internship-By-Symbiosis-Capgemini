package hibernate.branch.serviceImple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import hibernate.address.service.DeleteAddressService;
import hibernate.hibernate.mapping.dbconnection.DBConnection;
import hibernate.hibernate.mapping.entity.Address;
import hibernate.hibernate.mapping.entity.Branch;

public class DeleteBranchServiceImple implements DeleteAddressService{

	@Override
	public void DeleteData() {
		// TODO Auto-generated method stub
		EntityManager eManager = DBConnection.dbCon().createEntityManager();

        eManager.getTransaction().begin();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Address Id");

        int id = scanner.nextInt();

        Branch a1 = eManager.find(Branch.class, id);

        if (a1 != null) {

            eManager.remove(a1);

            eManager.getTransaction().commit();

            System.out.println("Branch Deleted");

        } else {

            System.out.println("Branch Not Found");
        }
	}
	
	
}
