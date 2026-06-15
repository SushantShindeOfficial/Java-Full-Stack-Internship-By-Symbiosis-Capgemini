package google.task.serviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.Student;
import google.task.entity.Subject;
import google.task.service.UpdateStudentService;

public class UpdateStudentServiceImple implements UpdateStudentService{

	@Override
	public Student updateStudent(int id) {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		Student s2 = em.find(Student.class, id);
		System.out.println("Enter Student Data to Update");
		System.out.println("Enter Student Name");
		String name=s1.next();
		System.out.println("Enter Student city");
		String city =s1.next();
		System.out.println("Enter Student percentage ");
		float percentage =s1.nextFloat();

	
		s2.setName(name);
		s2.setCity(city);
		s2.setPercentage(percentage);
		
		em.merge(s2);

		em.getTransaction().commit();
		System.out.println("Student updated");
		return s2;
	}

}
