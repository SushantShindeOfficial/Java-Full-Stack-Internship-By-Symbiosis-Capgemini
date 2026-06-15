package google.task.serviceimple;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import google.task.dbconnection.DbConnection;
import google.task.entity.Student;
import google.task.service.FetchStudentService;

public class FetchStudentServiceImple implements FetchStudentService{

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();

		String jpql = "select s from Student s";

		Query q1 = em.createQuery(jpql);

		List<Student> l1 = q1.getResultList();
		System.out.println(l1);

		return l1;
	}

}
