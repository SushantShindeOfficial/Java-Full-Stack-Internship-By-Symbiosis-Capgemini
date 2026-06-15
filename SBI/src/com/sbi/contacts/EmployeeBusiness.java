package com.sbi.contacts;

import java.util.Scanner;

public class EmployeeBusiness {
	
	
	Employee e1 =new Employee();
	
	public void getData() {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter Name of Employee: ");
		e1.setName(s1.next());
		
		System.out.println("Enter City of Employee: ");
		e1.setCity(s1.next());
		
		System.out.println("Enter Dept of Employee: ");
		e1.setDept(s1.next());
		
		System.out.println("Enter salary of Employee: ");
		e1.setSalary(s1.nextFloat());
		
//		e1.setCity(City);
//		e1.setDept(dept);
//		e1.setName(name);
//		e1.setSalary(salary);
	}
	
	public void displayData() {
		System.out.println("Name: " +e1.getName());
        System.out.println("City: " + e1.getCity());
        System.out.println("Department: " + e1.getDept());
        System.out.println("Salary: " + e1.getSalary());
		
	}
}
