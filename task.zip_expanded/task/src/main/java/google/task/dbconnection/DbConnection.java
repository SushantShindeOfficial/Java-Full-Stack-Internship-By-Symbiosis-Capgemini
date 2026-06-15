package google.task.dbconnection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnection {

	private DbConnection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static EntityManagerFactory dbconn() {
		EntityManagerFactory em	=Persistence.createEntityManagerFactory("mysql");
		return em;

	}
	

}
