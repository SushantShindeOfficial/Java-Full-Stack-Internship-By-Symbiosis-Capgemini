package google.drive.serviceImple;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import google.dbConnection.DBConnection;
import google.drive.service.DeleteService;

public class DeleteServiceImple implements DeleteService {
	private static final String delete = "DELETE FROM employee WHERE id = ?";

	@Override
	public void DeleteServicee() throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Employee ID to be Deleted: ");
		int id = s1.nextInt();
		System.out.println("Enter Employee Name to be Deleted: ");
		String name = s1.next();
		System.out.println("Enter Employee City to be Deleted: ");
		String city = s1.next();

		PreparedStatement ps = DBConnection.dbConn().prepareStatement(delete);
		ps.setInt(1, id);

		int rows = ps.executeUpdate();

		if (rows > 0) {
			System.out.println("Employee Deleted Successfully");
		} else {
			System.out.println("Employee Not Found");
		}

		ps.close();

	}

}
