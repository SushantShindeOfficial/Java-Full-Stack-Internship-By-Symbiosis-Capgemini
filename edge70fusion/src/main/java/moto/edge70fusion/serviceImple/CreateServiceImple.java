package moto.edge70fusion.serviceImple;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import moto.edge70fusion.dbconnection.DBconnection;
import moto.edge70fusion.entity.Address;
import moto.edge70fusion.entity.Employee1;
import moto.edge70fusion.service.CreateService;

public class CreateServiceImple implements CreateService {
	private final static String insert = " insert into tblemployee(id,name,city,salary,dept)"+"values(?,?,?,?,?)";
	@Override
	public void addEmp() throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Employee1 e1=new Employee1();
		Address a1=new Address();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		System.out.println("Enter Employee name");
		String name = sc.next();
		System.out.println("Enter Employee city");
		String city = sc.next();
		
		System.out.println("Enter Employee salary");
		float salary = sc.nextFloat();
		
		System.out.println("Enter Employee dept");
		String dept = sc.next();
		
		System.out.println("Enter Employee AddressID");
		String AddressID = sc.next();
		
		PreparedStatement ps=DBconnection.getConnection().prepareStatement(insert);
		Employee1 e2 = new Employee1();
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, city);
		ps.setFloat(4, salary);
		ps.setString(5, dept);
		ps.executeUpdate(); 
		System.out.println("Data inserted");
	}

}
