package moto.edge60fusion.serviceImple;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import moto.edge60fusion.dbconnection.DBconnection;
import moto.edge60fusion.entity.Employee;
import moto.edge60fusion.service.UpdateService;

public class UpdateServiceImple implements UpdateService {

	private final static String update = "update tblemployee set name=?,city=?,salary=? where id=?";

	@Override
	public void UpdateServiceEmp() throws SQLException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub

		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter employee id");
		int id = s1.nextInt();
		System.out.println("Enter Employee name");
		String name = s1.next();
		System.out.println("Enter Employee city");
		String city = s1.next();

		System.out.println("Enter Employee salary");
		float salary = s1.nextFloat();

		System.out.println("Enter Employee dept");
		String dept = s1.next();

		PreparedStatement ps = DBconnection.getConnection().prepareStatement(update);
		Employee e1 = new Employee();
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, city);
		ps.setFloat(4, salary);
		ps.setString(5, dept);
		ps.executeUpdate();
		System.out.println("Data Updated");

	}

}
