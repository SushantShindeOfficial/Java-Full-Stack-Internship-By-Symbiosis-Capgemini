package google.drive.serviceImple;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import google.dbConnection.DBConnection;
import google.drive.service.CreateService;

public class CreateServiceImple implements CreateService {
	private final static String insert = "insert into employee (id,name,city)" + "values(?,?,?)";

	@Override
	public void addEmployee() throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		int id = s1.nextInt();
		System.out.println("Enter Employee Name: ");
		String name = s1.next();
		System.out.println("Enter Employee City: ");
		String city = s1.next();

		PreparedStatement ps =DBConnection.dbConn().prepareStatement(insert);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, city);
		ps.executeUpdate();

	}

}
