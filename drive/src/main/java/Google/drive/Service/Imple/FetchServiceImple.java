package Google.drive.Service.Imple;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Google.drive.Services.FetchService;
import Google.drive.dbConnection.DBConnection;

public class FetchServiceImple implements FetchService {
	private final static String fetch = "select id,name,City from student";
	

	@Override
	public void FetchService() throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Statement statement=DBConnection.dbConn().createStatement();
		ResultSet rSet=statement.executeQuery(fetch);
		while(rSet.next()) {
			System.out.println(rSet.getInt(1)+ " "+rSet.getString(2)+" "+rSet.getString(3));
		}
	}

}
