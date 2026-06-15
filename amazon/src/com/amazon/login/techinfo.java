package com.amazon.login;

import java.util.Scanner;

public class techinfo {
	Teacher t1=new Teacher();
	
	public void getData() {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter Name: ");
		t1.setTechname(a.next());
		System.out.println("Enter add: ");
		t1.setTechaddress(a.next());
		System.out.println("Enter dept: ");
		t1.setTechposition(a.next());
		System.out.println("Enter adhar: ");
		t1.setTechSalary(a.next());
				
		
	}
	
	public void displayData() {
		
		System.out.println("Name is"+t1.getTechname());
		System.out.println("add is"+t1.getTechaddress());
		System.out.println("dept is"+t1.getTechposition());
		System.out.println("adhar is"+t1.getTechSalary());
		
	}

}
