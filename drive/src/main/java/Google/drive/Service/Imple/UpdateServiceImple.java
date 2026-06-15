package Google.drive.Service.Imple;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

import Google.drive.Services.UpdateService;
import Google.drive.dbConnection.DBConnection;

public class UpdateServiceImple implements UpdateService {
	private final static String update = "update student set name='Sushant'"
			+"where id=101";
	@Override
	public void UpdateService() throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		
		Statement c1 = DBConnection.dbConn().createStatement();
		c1 .executeUpdate(update);
		System.out.println("Data Updated");
		
	}



}
