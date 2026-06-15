package jdbc.homework5jdbc.homework5.java.demo.servieImple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jdbc.homework5.java.demo.dbconnection.DBConnection;
import jdbc.homework5jdbc.homework5.java.demo.service.FetchService;

public class FetchServiceImpl implements FetchService {

	@Override
	public void fetchProducts() {

		try {

			Connection con = DBConnection.getConnection();

			String sql = "select * from tblproduct";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				System.out.println(

						rs.getInt(1) + " " +

								rs.getString(2) + " " +

								rs.getFloat(3) + " " +

								rs.getString(4) + " " +

								rs.getString(5));
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
