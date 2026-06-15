package moto.edge70fusion.serviceImple;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import moto.edge70fusion.dbconnection.DBconnection;
import moto.edge70fusion.service.FetchService;

public class FetchServiceImple implements FetchService {

	private final static String update = "update tblemployee set name=?,city=?,salary=? where id=?";

	@Override
	public void FetchEmp() throws IOException, SQLException, ClassNotFoundException {

		PreparedStatement ps = DBconnection.getConnection().prepareStatement(update);

		ResultSet rs = ps.executeQuery();

		while(rs.next()) {

			System.out.println("Employee ID : " + rs.getInt("id"));
			System.out.println("Employee Name : " + rs.getString("name"));
			System.out.println("Employee City : " + rs.getString("city"));
			System.out.println("Employee Department : " + rs.getString("dept"));
			System.out.println("Employee Salary : " + rs.getFloat("salary"));

			
		}
	}
}