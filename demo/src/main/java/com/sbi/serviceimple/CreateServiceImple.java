package com.sbi.serviceimple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.sbi.entity.Address;
import com.sbi.entity.Employee;
import com.sbi.entity.Org;
import com.sbi.servie.CreateService;

public class CreateServiceImple implements CreateService {
	
	Scanner s1=new Scanner(System.in);

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Address a1 = new Address();
		Org o1 = new Org();
		// employee
		System.out.println("Enter Employee Details ");
		System.out.println("Enter your empId");
		e1.setId(s1.nextInt());

		System.out.println("Enter your Emp Name");
		e1.setName(s1.next());

		System.out.println("Enter your Emp City");
		e1.setCity(s1.next());

		System.out.println("Enter your Emp Address");
		e1.setAddress(a1);

		// address
		System.out.println("Enter your Emp address Details");
		System.out.println("Enter your Area");
		a1.setArea(s1.next());

		System.out.println("Enter your City");
		a1.setCity(s1.next());

		System.out.println("Enter your Landmark");
		a1.setLandmark(s1.next());

		System.out.println("Enter your pincode");
		a1.setPin(s1.next());

		System.out.println("Enter Your Organization Details ");
		System.out.println("Enter your Org address");
		o1.setOrgaddress(a1);

		System.out.println("Enter your Org City");
		o1.setOrgcity(s1.next());

		System.out.println("Enter your Org address");
		o1.setOrgcity(s1.next());

		System.out.println("Enter your Org id");
		o1.setOrgid(s1.next());

		System.out.println("Enter your Org Name");
		o1.setOrgname(s1.next());

		System.out.println("Enter your Org address");
		o1.setOrgorg(o1);

		// Setting Adhress and Org
		e1.setAddress(a1);
		e1.setOrg(o1);
		Scanner s1 = new Scanner(System.in);
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		
		System.out.println(emp);
	}

}
