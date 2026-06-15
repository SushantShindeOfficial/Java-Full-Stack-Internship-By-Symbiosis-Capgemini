package google.task.serviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.Principal;
import google.task.service.CreatePrincipalService;

public class CreatePrincipalServiceImple implements CreatePrincipalService{

	@Override
	public Principal addPrincipal() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Principal Data");
		System.out.println("Enter Principal Id");
		int id=s1.nextInt();
		System.out.println("Enter Principal Name");
		String name=s1.next();
		System.out.println("Enter Principal city");
		String city =s1.next();
		System.out.println("Enter Principal salary ");
		float salary =s1.nextFloat();

		Principal p1=new Principal();
		p1.setId(id);
		p1.setName(name);
		p1.setCity(city);
		p1.setSalary(salary);
		
		em.persist(p1);

		em.getTransaction().commit();
		System.out.println("Principal added");
		return p1;
	}

}
