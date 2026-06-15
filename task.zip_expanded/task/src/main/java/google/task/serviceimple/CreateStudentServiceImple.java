package google.task.serviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.Student;
import google.task.service.CreateStudentService;

public class CreateStudentServiceImple implements CreateStudentService{

	@Override
	public Student addStudent() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Student Data");
		System.out.println("Enter Student Id");
		int id=s1.nextInt();
		System.out.println("Enter Student Name");
		String name=s1.next();
		System.out.println("Enter Student city");
		String city =s1.next();
		System.out.println("Enter Student percentage ");
		float percentage =s1.nextFloat();

		Student s2=new Student();
		s2.setId(id);
		s2.setName(name);
		s2.setCity(city);
		s2.setPercentage(percentage);
		em.persist(s2);

		em.getTransaction().commit();
		System.out.println("Student added");
		return s2;
	}

}
