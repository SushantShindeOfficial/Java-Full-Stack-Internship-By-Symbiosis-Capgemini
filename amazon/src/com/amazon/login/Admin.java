package com.amazon.login;

import java.util.Scanner;

public class Admin extends details {
	
	details d1=new details();
	
	public void getData() {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter Name: ");
		d1.setAdname(a.next());
		System.out.println("Enter id: ");
		d1.setAdid(a.nextInt());
		System.out.println("Enter dept: ");
		d1.setAddept(a.next());
		System.out.println("Enter adhar: ");
		d1.setAdadhar(a.next());
		System.out.println("Enter Mobile: ");
		d1.setAdmobile(a.next());
		
		
	}
	
	public void displayData() {
		
		System.out.println("Name is"+d1.getAdname());
		System.out.println("id is"+d1.getAdid());
		System.out.println("dept is"+d1.getAddept());
		System.out.println("adhar is"+d1.getAdadhar());
		System.out.println("mob is"+d1.getAdmobile());	
	}
	

}
