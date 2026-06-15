package jdbc.homework5jdbc.homework5.java.demo.servieImple;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jdbc.homework5.java.demo.dbconnection.DBConnection;
import jdbc.homework5.java.demo.entity.Product;
import jdbc.homework5jdbc.homework5.java.demo.service.CreateService;

public class CreateServiceImpl implements CreateService {

	@Override
	public void createProduct(Product p) {

		try {

			Connection con = DBConnection.getConnection();

			String sql = "insert into tblproduct values(?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, p.getId());

			ps.setString(2, p.getName());

			ps.setFloat(3, p.getPrice());

			ps.setString(4, p.getDescription());

			ps.setString(5, p.getCategory());

			ps.executeUpdate();

			System.out.println("Product Inserted");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
