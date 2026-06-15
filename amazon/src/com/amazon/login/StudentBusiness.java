package com.amazon.login;

import java.util.Scanner;

public class StudentBusiness {
	
	Student s1=new Student();
	
	public void getData() {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter Name: ");
		s1.setName(a.next());
		System.out.println("Enter id: ");
		s1.setId(a.nextInt());
		System.out.println("Enter dept: ");
		s1.setDept(a.next());
		System.out.println("Enter adhar: ");
		s1.setAdhar(a.next());
		System.out.println("Enter Mobile: ");
		s1.setMobile(a.next());
		
		
	}
	
	public void displayData() {
		
		System.out.println("Name is"+s1.getName());
		System.out.println("id is"+s1.getId());
		System.out.println("dept is"+s1.getDept());
		System.out.println("adhar is"+s1.getAdhar());
		System.out.println("mob is"+s1.getMobile());	
	}
}
