package moto.edge60fusion.serviceImple;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import moto.edge60fusion.dbconnection.DBconnection;
import moto.edge60fusion.service.FetechService;

public class FetchServiceImple implements FetechService {
	private final static String fetch="select id, name, city,dept,salary from tblEmployee";
	@Override
	public void FetchServiceEmp() throws IOException, SQLException, ClassNotFoundException {
		// TODO Auto-generated method 
		
			
			PreparedStatement ps=DBconnection.getConnection().prepareStatement(fetch);
			
			ResultSet rs = ps.executeQuery(fetch);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
			}
	}

}
