package google.task.serviceimple;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import google.task.dbconnection.DbConnection;
import google.task.entity.Principal;
import google.task.service.FetchPrincipalService;

public class FetchPrincipalServiceImple implements FetchPrincipalService{

	@Override
	public List<Principal> getPrincipal() {
		// TODO Auto-generated method stub
		EntityManager em=DbConnection.dbconn().createEntityManager();

		String jpql = "select s from Principal s";

		Query q1 = em.createQuery(jpql);

		List<Principal> l1 = q1.getResultList();
		System.out.println(l1);

		return l1;
	}

}
