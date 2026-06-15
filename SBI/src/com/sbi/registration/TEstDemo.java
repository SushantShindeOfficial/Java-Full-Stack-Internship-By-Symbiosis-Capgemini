package com.sbi.registration;

public class TEstDemo {
	public static void main(String[] args) {
//		student s1=new student();
//		s1.getData(1234,"pune","xyz","sham@gmail.com","pqr",7.14f);
//		s1.Display();
		
		Teacher t1=new Teacher();
		t1.setCity("xyz");
		t1.setDept("CSE");
		t1.setName("RAM");
		t1.setSalary(7.14f);
		
		System.out.println("City is "+t1.getCity());
		System.out.println("Dept is "+t1.getDept());
		System.out.println("Name is "+t1.getName());
		System.out.println("Salary is "+t1.getSalary());
		
	}

}
