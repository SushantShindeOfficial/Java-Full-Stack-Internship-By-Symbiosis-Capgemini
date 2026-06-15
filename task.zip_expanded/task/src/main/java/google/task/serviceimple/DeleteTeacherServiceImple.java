package google.task.serviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import google.task.dbconnection.DbConnection;
import google.task.entity.Teacher;
import google.task.service.DeleteTeacherService;

public class DeleteTeacherServiceImple implements DeleteTeacherService{

	@Override
	public int deleteTeacher() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();
		em.getTransaction().begin();
		Scanner s1=new Scanner(System.in);
		System.out.println("Delete Teacher Data");
		System.out.println("Enter Teacher Id to delete");
		int id=s1.nextInt();

		Teacher s2 = em.find(Teacher.class, id);
		
		em.remove(s2);

		em.getTransaction().commit();
		System.out.println("Teacher deleted");
		return 0;
	}

}
