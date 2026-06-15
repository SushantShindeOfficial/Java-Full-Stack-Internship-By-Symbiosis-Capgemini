package com.coep.registration;

import java.util.Scanner;

public class EmpImple implements EmpService{

	Scanner s1=new Scanner(System.in);
	Emp e1=new Emp();
	Address a1=new Address();

	@Override
	public void fetchData() {
		System.out.println("Enter ID");
		e1.setId(s1.nextInt());
		System.out.println("Enter Name");
		e1.setName(s1.next());
		

		System.out.println("-------Enter Address---------");

		System.out.println("Enter City: ");
		a1.setCity(s1.next());
		System.out.println("Enter Pin: ");
		a1.setPin(s1.nextInt());
		System.out.println("Enter Area: ");
		a1.setArea(s1.next());
		System.out.println("Enter Location: ");
		a1.setLocation(s1.next());

		e1.setAddress(a1);

	}

	@Override
	public void addData() {
		
		System.out.println("ID: "+e1.getId());
		System.out.println("Name: "+e1.getName());
		System.out.println("Address"+e1.getAddress());
		
		System.out.println("City"+a1.getCity());
		System.out.println("Pin"+a1.getPin());
		System.out.println("Area"+a1.getArea());
		System.out.println("Location "+a1.getLocation());

	}
}
