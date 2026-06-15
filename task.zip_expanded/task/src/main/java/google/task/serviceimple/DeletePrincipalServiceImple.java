package google.task.serviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.Principal;
import google.task.service.DeletePrincipalService;

public class DeletePrincipalServiceImple implements DeletePrincipalService{

	@Override
	public int deletePrincipal() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		System.out.println("Delete Principal Data");
		System.out.println("Enter Principal Id to delete");
		int id=s1.nextInt();

		Principal s2 = em.find(Principal.class, id);
		
		em.remove(s2);

		em.getTransaction().commit();
		System.out.println("Principal deleted");
		return 0;
	}

}
