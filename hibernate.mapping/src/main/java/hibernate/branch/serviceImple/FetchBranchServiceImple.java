package hibernate.branch.serviceImple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import hibernate.address.service.FetchAddressService;
import hibernate.hibernate.mapping.dbconnection.DBConnection;
import hibernate.hibernate.mapping.entity.Address;
import hibernate.hibernate.mapping.entity.Branch;
public class FetchBranchServiceImple implements FetchAddressService{

	@Override
	public void FetchData() {
		// TODO Auto-generated method stub
		EntityManager em = DBConnection.dbCon().createEntityManager();

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Branch Id");

        int id = s1.nextInt();

        Branch a1 = em.find(Branch.class, id);

        if (a1 != null) {

            System.out.println(a1);

        } else {

            System.out.println("Branch Not Found");
        }
	}

	
	
	
}
