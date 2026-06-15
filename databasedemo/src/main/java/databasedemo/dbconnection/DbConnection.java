package databasedemo.dbconnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

	private static final String user = "root";
	private static final String passward = "1234";
	private static final String url = "jdbc:mysql://localhost:3306/satara";

	private DbConnection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnection() throws SQLException, IOException {
		
		File f1=new File("db.properties");
		FileInputStream f2=new FileInputStream(f1);
		Properties p1=new Properties();
		p1.load(f2);
		
		final String user=p1.getProperty("user");
		final String passward=p1.getProperty("passward");
		final String url=p1.getProperty("url");
		try (Connection connection = DriverManager.getConnection(url, passward, user)) {
			return connection;
		}

	}

}
