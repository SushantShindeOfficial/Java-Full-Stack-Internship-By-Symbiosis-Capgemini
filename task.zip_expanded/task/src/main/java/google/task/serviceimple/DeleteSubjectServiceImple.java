package google.task.serviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.Subject;
import google.task.service.DeleteSubjectService;

public class DeleteSubjectServiceImple implements DeleteSubjectService{

	@Override
	public int deleteSubject() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		System.out.println("Delete Subject Data");
		System.out.println("Enter Subject Id to delete");
		int id=s1.nextInt();

		Subject s2 = em.find(Subject.class, id);
		
		em.remove(s2);

		em.getTransaction().commit();
		System.out.println("Subject deleted");
		return 0;
	}

}
