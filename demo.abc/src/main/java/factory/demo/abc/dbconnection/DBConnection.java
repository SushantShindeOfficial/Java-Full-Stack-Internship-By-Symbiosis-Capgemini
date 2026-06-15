package factory.demo.abc.dbconnection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConnection {
	public static EntityManagerFactory dbconn() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql");
		return emf;
	}
}
