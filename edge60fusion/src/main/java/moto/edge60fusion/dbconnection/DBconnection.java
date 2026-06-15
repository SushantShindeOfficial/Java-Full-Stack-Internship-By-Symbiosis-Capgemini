package moto.edge60fusion.dbconnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBconnection {
	private static final String user = "root";
	private static final String password = "1234";
	private static final String url = "jdbc:mysql://localhost:3306/dbmanagement";

	public DBconnection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnection() throws SQLException, IOException, ClassNotFoundException {

		File f1 = new File("C:\\Users\\HP\\eclipse-workspace\\edge60fusion\\src\\main\\resources\\db.properties");
		FileInputStream f2 = new FileInputStream(f1);
		Properties p1 = new Properties();
		p1.load(f2);

		final String user = p1.getProperty("user");
		final String password = p1.getProperty("password");
		final String url = p1.getProperty("url");
		
		
		//setting driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Setting up Connection
		Connection connection=DriverManager.getConnection(url,user,password);
		System.out.println("Connection Establish");
		return connection;

	}
}
