package google.task.serviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.College;
import google.task.service.DeleteCollegeService;

public class DeleteCollegeServiceImple implements DeleteCollegeService{

	@Override
	public int deleteCollege() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		System.out.println("Delete College Data");
		System.out.println("Enter College Id to delete");
		int id=s1.nextInt();

		College s2 = em.find(College.class, id);
		
		em.remove(s2);

		em.getTransaction().commit();
		System.out.println("College deleted");
		return 0;
	}

}
