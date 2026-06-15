package google.drive.serviceImple;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import google.dbConnection.DBConnection;
import google.drive.service.UpdateService;

public class UpdateServiceImple  implements UpdateService{
	private static final String update = "UPDATE employee SET name = ?, city = ? WHERE id = ?";
	@Override
	public void UpdateServicee() throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Employee ID to Upadte: ");
		int id = s1.nextInt();
		System.out.println("Enter Employee Name to Update: ");
		String name = s1.next();
		System.out.println("Enter Employee City to Update: ");
		String city = s1.next();
		
//		PreparedStatement ps =DBConnection.dbConn().prepareStatement(update);
//		ps.setString(1, name);
//		ps.setString(2, city);
//		ps.setInt(3, id);
		
		PreparedStatement ps = DBConnection.dbConn().prepareStatement(update);

		ps.setString(1, name);
		ps.setString(2, city);
		ps.setInt(3, id);

		int rows = ps.executeUpdate();

		if (rows > 0) {
		    System.out.println("✅ Employee Updated Successfully");
		} else {
		    System.out.println("❌ Employee Not Found");
		}
	}

}
