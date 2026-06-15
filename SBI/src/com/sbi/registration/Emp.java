package com.sbi.registration;


public class Emp {
	
	private int id;
	static int salary;
	private String nameString;
	
	public Emp() {
		super();
	}
	
	static {
		
		
	}
	
	{
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public static int getSalary() {
		return salary;
	}

	public static void setSalary(int salary) {
		Emp.salary = salary;
	}

	static void demo() {
		
	
	} 
	
	
	
	public static void main(String[] args) {
		
		Emp e1=new Emp();
		e1.setId(22);
		e1.setNameString("Ram");
		e1.setSalary(3456456);
		
//		System.out.println("The id is :"+getId());
//		System.out.println("The Name is :"+getNameString());
		System.out.println("The Salary is :"+getSalary());
		
	}

}
