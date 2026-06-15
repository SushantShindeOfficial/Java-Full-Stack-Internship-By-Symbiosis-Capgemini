package com.sbi.contacts;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Demo {
	
	private String City;
	private String name;
	private String dept;
	private float salary;
	
	Scanner s1=new Scanner(System.in);
	
	void getData() {
		
		
		
		System.out.println("Enter Name of Employee: ");
		name=s1.next();
		
		System.out.println("Enter City of Employee: ");
		City=s1.next();
		
		System.out.println("Enter Dept of Employee: ");
		dept=s1.next();
		
		System.out.println("Enter salary of Employee: ");
		salary=s1.nextFloat();

		
	}
	
	void displayData() {
		
		System.out.println("Name: " + name);
        System.out.println("City: " + City);
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + salary);
	}
}
