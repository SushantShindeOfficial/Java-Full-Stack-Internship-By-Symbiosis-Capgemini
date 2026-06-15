package google.task.serviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.Subject;
import google.task.service.CreateSubjectService;

public class CreateSubjectServiceImple implements CreateSubjectService{

	@Override
	public Subject addSubject() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Subject Data");
		System.out.println("Enter Subject Id");
		int id=s1.nextInt();
		System.out.println("Enter Subject Name");
		String name=s1.next();
		System.out.println("Enter Subject author");
		String author =s1.next();

		Subject s2=new Subject();
		s2.setId(id);
		s2.setName(name);
		s2.setAuthor(author);
		
		em.persist(s2);

		em.getTransaction().commit();
		System.out.println("Subject added");
		return s2;
	}

}
