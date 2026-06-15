package spring.web.app.project.connection;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DBConnection {

	public DBConnection() {
		super();
	}
	public static EntityManagerFactory dbconn() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mysql");
				
		return entityManagerFactory;
		
	}
}
