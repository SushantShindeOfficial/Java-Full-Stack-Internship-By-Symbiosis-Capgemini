package hibernate.hibernate.manytomany.dbconnection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConnection {
	public static EntityManagerFactory dbCon() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
		return emf;
	}

	private DBConnection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static EntityManagerFactory dbConnection() {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("Mysql");
		return entityManagerFactory;
	}
}
