package Google.drive.Service.Imple;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

import Google.drive.Services.CreateService;
import Google.drive.dbConnection.DBConnection;


public class CreateServiceimple implements CreateService {

	public final static String insert="insert into student"+"(id,name,city) values(101,'Onkar','Saswad')";

	@Override
	public void addStudent() throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Statement c1 = DBConnection.dbConn().createStatement();
		c1 .executeUpdate(insert);
		System.out.println("Data inserted");
	}

}
