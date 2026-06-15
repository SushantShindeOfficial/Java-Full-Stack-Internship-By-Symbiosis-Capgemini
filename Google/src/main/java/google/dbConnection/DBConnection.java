package google.dbConnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	// Superclass Constructor
	public DBConnection() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Connection method
	public static Connection dbConn() throws SQLException, IOException, ClassNotFoundException {

		// Getting Credentials form Environment file
		File f1 = new File("C:\\Users\\HP\\eclipse-workspace\\Google\\src\\main\\resources\\db.properties");
		FileInputStream f2 = new FileInputStream(f1);
		Properties p1 = new Properties();
		p1.load(f2);

		final String user = p1.getProperty("user");
		final String password = p1.getProperty("passward");
		final String url = p1.getProperty("url");

		// setting driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Setting up Connection
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println("Connection Establish");
		return connection;

	}

}
