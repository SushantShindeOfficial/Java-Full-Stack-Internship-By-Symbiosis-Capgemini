package google.task.serviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.Principal;
import google.task.entity.Subject;
import google.task.service.UpdatePrincipalService;

public class UpdatePrincipalServiceImple implements UpdatePrincipalService{

	@Override
	public Principal updatePrincipal(int id) {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		Principal s2 = em.find(Principal.class, id);
		System.out.println("Enter Principal Data to Update");
		System.out.println("Enter Principal Name");
		String name=s1.next();
		System.out.println("Enter Principal city");
		String city =s1.next();
		System.out.println("Enter Principal salary ");
		float salary =s1.nextFloat();

	
		s2.setName(name);
		s2.setCity(city);
		s2.setSalary(salary);
		
		em.merge(s2);

		em.getTransaction().commit();
		System.out.println("Principal updated");
		return s2;
	}

}
