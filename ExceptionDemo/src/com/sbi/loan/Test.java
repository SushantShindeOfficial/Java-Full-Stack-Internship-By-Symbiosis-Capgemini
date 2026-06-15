package com.sbi.loan;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
	
		final static  String user="root";
		final static  String url="jdbc:mysql://locailhost:3306/satara";
		final static  String pass="1234";
		
	public static void main(String[] args) throws SQLException {	
		
		String insert="insert into tblemp values(101,'sdf','dfg')";
		try(Connection connection=DriverManager.getConnection(user,url,pass);)
		{
			//Resource Allocation and Deallocation
			//Acts as Finally Block
			System.out.println("Connection Successful");
			Statement statement=(Statement) connection.createStatement();
			((java.sql.Statement) statement).executeUpdate(insert);
		}
		
	}
}
