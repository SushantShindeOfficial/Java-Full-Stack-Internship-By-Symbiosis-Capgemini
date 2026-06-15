package google.task.serviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.Student;
import google.task.entity.Subject;
import google.task.service.DeleteStudentService;

public class DeleteStudentServiceImple implements DeleteStudentService{

	@Override
	public int deleteStudent() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		System.out.println("Delete Student Data");
		System.out.println("Enter Student Id to delete");
		int id=s1.nextInt();

		Student s2 = em.find(Student.class, id);
		
		em.remove(s2);

		em.getTransaction().commit();
		System.out.println("Student deleted");
		return 0;
	}

}
