package com.exceptiondemo.databaseoprations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbTest {
	
	final static String user="root";
	final static String passward="1234";
	final static String url="jdbc:mysql://localhost:3306/sushant";
	public static void main(String[] args) throws SQLException {
		
		//Connection is Interface not Class 
		Connection connection=DriverManager.getConnection(url,user,passward);

		
		try {
						//connection.createStatement();
			System.out.println("Connection Open And Ready For CRUD Operation");
			String string=null;
			System.out.println(string.charAt(0));
			
			System.out.println("BD Operation Completed");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error in Code");
		}
		finally {
			connection.close();
			System.out.println("Connection is Closed");
		}
		
		
		
	}
}
