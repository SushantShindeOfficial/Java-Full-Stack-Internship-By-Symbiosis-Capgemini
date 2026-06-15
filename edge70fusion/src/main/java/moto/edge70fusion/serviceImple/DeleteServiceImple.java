package moto.edge70fusion.serviceImple;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import moto.edge70fusion.dbconnection.DBconnection;
import moto.edge70fusion.service.DeleteService;

public class DeleteServiceImple implements DeleteService {
	private final static String delete = "delete from tblemployee where id=?";

	@Override
	public void DeleteEmp() throws SQLException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee ID to delete");
		int id = sc.nextInt();

		PreparedStatement ps = DBconnection.getConnection().prepareStatement(delete);

		ps.setInt(1, id);

		int i = ps.executeUpdate();

		if (i > 0) {
			System.out.println("Data Deleted Successfully");
		} else {
			System.out.println("Data Not Found");
		}

	}

}
