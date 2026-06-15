package hibernate.hibernate.mapping.manytoone.dbconnection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConnection {
	public static EntityManagerFactory dbCon() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
		return emf;
	}

	public DBConnection() {
		super();
		// TODO Auto-generated constructor stub
	}

}
