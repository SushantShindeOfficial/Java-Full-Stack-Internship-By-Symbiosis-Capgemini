package google.task.serviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.Subject;
import google.task.entity.Teacher;
import google.task.service.UpdateTeacherService;

public class UpdateTeacherServiceImple implements UpdateTeacherService{

	@Override
	public Teacher updateTeacher(int id) {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		Teacher s2 = em.find(Teacher.class, id);
		System.out.println("Enter Teacher Data to Update");
		System.out.println("Enter Teacher Name");
		String name=s1.next();
		System.out.println("Enter Teacher city");
		String city =s1.next();
		System.out.println("Enter Teacher salary ");
		float salary =s1.nextFloat();

	
		s2.setName(name);
		s2.setCity(city);
		s2.setSalary(salary);
		
		em.merge(s2);

		em.getTransaction().commit();
		System.out.println("Teacher updated");
		return s2;
	}

	
}
