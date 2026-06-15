package hibernate.UserMngtSys.demo.test;

import javax.persistence.EntityManager;

import hibernate.UserMngtSys.demo.dbconnection.DBConnection;

public class Test {
	public static void main(String[] args) {
		EntityManager eManager=DBConnection.dbConn().createEntityManager();
		eManager.getTransaction().begin();
		
		eManager.getTransaction().commit();
	}
}
