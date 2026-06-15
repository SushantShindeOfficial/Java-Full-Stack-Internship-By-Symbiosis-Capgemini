package hibernate.hbernate.demo.mtm.otm.dbconnection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConnection {
	

	public DBConnection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static EntityManagerFactory dbconn() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mysql");
		return entityManagerFactory;
	}

	
}
