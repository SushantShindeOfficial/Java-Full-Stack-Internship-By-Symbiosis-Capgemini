package databasedemo.dbconnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBCONection {
	private static final String user = "root";
	private static final String passward = "1234";
	private static final String url = "jdbc:mysql://localhost:3306/satara";
	
	private DBCONection() {
		super();
	}
	
	public static Connection dbCon() throws Exception {
		File f1=new File("C:\\Users\\HP\\eclipse-workspace\\databasedemo\\src\\main\\resources\\db.properties");
		FileInputStream f2=new FileInputStream(f1);
		Properties p1=new Properties();
		p1.load(f2);
		final String user=p1.getProperty("user");
		final String passward=p1.getProperty("passward");
		final String url=p1.getProperty("url");
		System.out.println(user);
		System.out.println(passward);
		System.out.println(url);
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection connection=DriverManager.getConnection(url,user,passward)){
			return connection;
		}
	}	
	
	public static void main(String[] args) throws Exception {
		dbCon();
		
	}
	
}
