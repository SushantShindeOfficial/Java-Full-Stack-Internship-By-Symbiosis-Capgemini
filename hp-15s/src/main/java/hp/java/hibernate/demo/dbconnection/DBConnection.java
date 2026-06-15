package hp.java.hibernate.demo.dbconnection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConnection {
	public DBConnection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static EntityManagerFactory dbCon() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
		return emf;
	}
}
