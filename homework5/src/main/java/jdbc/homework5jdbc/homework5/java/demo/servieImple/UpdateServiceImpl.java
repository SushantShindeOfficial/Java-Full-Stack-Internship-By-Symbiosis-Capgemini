package jdbc.homework5jdbc.homework5.java.demo.servieImple;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jdbc.homework5.java.demo.dbconnection.DBConnection;
import jdbc.homework5jdbc.homework5.java.demo.service.UpdateService;

public class UpdateServiceImpl implements UpdateService {

	@Override
	public void updateProductPrice(int id, float price) {

		try {

			Connection con = DBConnection.getConnection();

			String sql = "update tblproduct set price=? where id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setFloat(1, price);

			ps.setInt(2, id);

			ps.executeUpdate();

			System.out.println("Updated");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}