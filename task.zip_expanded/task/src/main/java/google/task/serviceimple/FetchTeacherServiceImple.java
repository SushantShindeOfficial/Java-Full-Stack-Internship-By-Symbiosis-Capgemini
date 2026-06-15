package google.task.serviceimple;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import google.task.dbconnection.DbConnection;
import google.task.entity.Teacher;
import google.task.service.FetchTeacherService;

public class FetchTeacherServiceImple implements FetchTeacherService{

	@Override
	public List<Teacher> geTeacher() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();

		String jpql = "select s from Teacher s";

		Query q1 = em.createQuery(jpql);

		List<Teacher> l1 = q1.getResultList();
		System.out.println(l1);

		return l1;
	}

}
