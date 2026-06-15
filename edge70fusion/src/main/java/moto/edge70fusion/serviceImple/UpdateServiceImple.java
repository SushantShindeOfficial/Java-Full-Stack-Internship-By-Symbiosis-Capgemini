package moto.edge70fusion.serviceImple;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import moto.edge70fusion.dbconnection.DBconnection;
import moto.edge70fusion.service.UpdateService;

public class UpdateServiceImple implements UpdateService {
	private final static String update = "update tblemployee set name=?,city=?,salary=? where id=?";
	
	@Override
	public void EmpUpdate() throws IOException, SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee ID");
		int id = sc.nextInt();

		System.out.println("Enter New Employee Name");
		String name = sc.next();

		System.out.println("Enter New Employee City");
		String city = sc.next();

		System.out.println("Enter New Employee Salary");
		float salary = sc.nextFloat();

		PreparedStatement ps = DBconnection.getConnection().prepareStatement(update);

		ps.setString(1, name);
		ps.setString(2, city);
		ps.setFloat(3, salary);
		ps.setInt(4, id);

		int i = ps.executeUpdate();


	}

}
