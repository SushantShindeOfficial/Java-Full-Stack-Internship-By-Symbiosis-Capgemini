package com.sbi.registration;

public class Employee {
	
//	int id=200;
//	String name="Joe";
	
	private int id=200;
	private String name="Joe";
	
	public void getData(int a,String b)
	{
		
		id=a;
		name=b;
	}
	
	public void displayData()
	{
		
		System.out.println("Id is : "+id);
		System.out.println("Name is : "+name);
	}

	
}
