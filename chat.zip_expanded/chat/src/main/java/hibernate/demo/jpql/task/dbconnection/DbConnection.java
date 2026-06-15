package hibernate.demo.jpql.task.dbconnection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnection {

	private DbConnection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static EntityManagerFactory dbCon() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql");
		return emf;
	}

}
