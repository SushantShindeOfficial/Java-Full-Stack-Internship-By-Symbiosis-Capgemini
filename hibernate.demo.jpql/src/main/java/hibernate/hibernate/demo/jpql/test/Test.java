package hibernate.hibernate.demo.jpql.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mysql");
		EntityManager eManager=entityManagerFactory.createEntityManager();
		eManager.getTransaction().begin();
		
		Query q1=eManager.createQuery("select p.id,p.name,p.price,"+"c.name Product p join Category c where c.id=p.id");
		List l1=q1.getResultList();
		eManager.getTransaction().commit();
		eManager.close();
	}
}
