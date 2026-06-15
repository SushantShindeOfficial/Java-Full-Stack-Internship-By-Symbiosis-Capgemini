package moto.edge60pro.serviceImple;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import moto.edge60pro.DBconnection.DBConnection;
import moto.edge60pro.entity.Employee;
import moto.edge60pro.service.EmpVerify;

public class EmpVerifyImple implements EmpVerify {
	private final static String insert = "insert into tblEmployee(name,city,salary,mailid) values(?,?,?,?) ";
	private final static String select = "select mailid from tblEmployee";

	@Override
	public void VerifyEmp() throws SQLException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		PreparedStatement ps = DBConnection.getConnection().prepareStatement(insert);
		Statement st = DBConnection.getConnection().createStatement();

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String name = s1.next();
		System.out.println("Enter Employee City: ");
		String city = s1.next();
		System.out.println("Enter Employee Salaray: ");
		Float salary = s1.nextFloat();
		System.out.println("Enter Employee MailID: ");
		String mailid = s1.next();

		ResultSet rs = st.executeQuery(select);
		
		while (rs.next()) {
			if (mailid.equals(rs.getString(1))) {
				System.out.println("Mail id is Already Exist");
			} else {
				Employee e1 = new Employee();
				e1.setName(name);
				e1.setSalary(salary);
				e1.setMailid(mailid);//you cas use mailid.toLowerCase
				e1.setCity(city);
				ps.setString(1, e1.getName());
				ps.setString(2, e1.getCity());
				ps.setString(3, e1.getMailid());
				ps.setInt(4, e1.getId());
				ps.setFloat(5, e1.getSalary());
			}

		}

	}

}
