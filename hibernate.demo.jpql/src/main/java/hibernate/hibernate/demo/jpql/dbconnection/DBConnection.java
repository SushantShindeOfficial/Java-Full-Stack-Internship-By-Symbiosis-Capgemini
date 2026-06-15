package hibernate.hibernate.demo.jpql.dbconnection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConnection {

	public DBConnection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static EntityManagerFactory dbconn() {
		EntityManagerFactory eManagerFactory=Persistence.createEntityManagerFactory("Mysql");
		return eManagerFactory;
	}
}
