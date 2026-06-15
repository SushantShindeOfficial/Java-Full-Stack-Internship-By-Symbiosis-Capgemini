package google.task.serviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.Subject;
import google.task.service.UpdateSubjectService;

public class UpdateSubjectServiceImple implements UpdateSubjectService{

	@Override
	public Subject updateSubject(int id) {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		Subject s2 = em.find(Subject.class, id);
		System.out.println("Enter Subject Data to Update");
		System.out.println("Enter Subject Name");
		String name=s1.next();
		System.out.println("Enter Subject author");
		String author =s1.next();

	
		s2.setName(name);
		s2.setAuthor(author);
		
		em.merge(s2);

		em.getTransaction().commit();
		System.out.println("Subject updated");
		return s2;
	}

}
