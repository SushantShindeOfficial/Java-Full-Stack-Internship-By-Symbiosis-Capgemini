package google.task.serviceimple;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import google.task.dbconnection.DbConnection;
import google.task.entity.Dept;
import google.task.service.FetchDeptService;

public class FetchDeptServiceImple implements FetchDeptService{

	@Override
	public List<Dept> getDept() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();

		String jpql = "select s from Dept s";

		Query q1 = em.createQuery(jpql);

		List<Dept> l1 = q1.getResultList();
		System.out.println(l1);

		return l1;
	}

}
