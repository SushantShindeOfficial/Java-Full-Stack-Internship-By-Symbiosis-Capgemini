package jdbc.homework5jdbc.homework5.java.demo.servieImple;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jdbc.homework5.java.demo.dbconnection.DBConnection;
import jdbc.homework5jdbc.homework5.java.demo.service.DeleteService;

public class DeleteServiceImpl implements DeleteService {

	@Override
	public void deleteProduct(int id) {

		try {

			Connection con = DBConnection.getConnection();

			String sql = "delete from tblproduct where id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			ps.executeUpdate();

			System.out.println("Deleted");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}