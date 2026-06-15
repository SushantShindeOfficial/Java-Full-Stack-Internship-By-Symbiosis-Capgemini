package google.drive.serviceImple;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import google.dbConnection.DBConnection;
import google.drive.service.FetchEmployee;

public class FetchEmployeeImple implements FetchEmployee{
    private static final String fetch = "SELECT * FROM employee WHERE id = ?";

	@Override
	public void FetchEmployeee() throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Employee ID to Fetched: ");
		int id = s1.nextInt();
		System.out.println("Enter Employee Name to Fetched: ");
		String name = s1.next();
		System.out.println("Enter Employee City to Fetched: ");
		String city = s1.next();
		
//		PreparedStatement ps =DBConnection.dbConn().prepareStatement(update);
//		ps.setString(1, name);
//		ps.setString(2, city);
//		ps.setInt(3, id);
		
		PreparedStatement ps = DBConnection.dbConn().prepareStatement(fetch);

		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();  // ✅ correct method

        if (rs.next()) {
            System.out.println("Employee Found");
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("City: " + rs.getString("city"));
        } else {
            System.out.println("Employee Not Found");
        }

        rs.close();
	
	}
    
}
