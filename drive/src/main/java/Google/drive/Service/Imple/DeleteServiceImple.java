package Google.drive.Service.Imple;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

import Google.drive.Services.DeleteService;
import Google.drive.dbConnection.DBConnection;

public class DeleteServiceImple implements DeleteService{
	private final static String delete = "delete from student where id=101";
	@Override
	public void DeleteService() throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Statement s1 = DBConnection.dbConn().createStatement();
		s1.executeUpdate(delete);
		System.out.println("Data Deleted");
		
	}

	

}
