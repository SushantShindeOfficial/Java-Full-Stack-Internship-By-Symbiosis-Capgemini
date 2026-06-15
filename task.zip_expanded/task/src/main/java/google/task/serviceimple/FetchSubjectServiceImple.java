package google.task.serviceimple;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import google.task.dbconnection.DbConnection;
import google.task.entity.Subject;
import google.task.service.FetchSubjectService;

public class FetchSubjectServiceImple implements FetchSubjectService{

	@Override
	public List<Subject> geSubject() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();

		String jpql = "select s from Subject s";

		Query q1 = em.createQuery(jpql);

		List<Subject> l1 = q1.getResultList();
		System.out.println(l1);

		return l1;
	}

}
