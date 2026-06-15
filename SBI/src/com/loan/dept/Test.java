package com.loan.dept;

public class Test {
	public static void main(String[] args) {
		
		
		SingletonDemo s1=SingletonDemo.demo();
		SingletonDemo s2=SingletonDemo.demo();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
//		SingletonDemo s1= new SingletonDemo();
//		s1.setId(101);
//		System.out.println(s1.getId());
//		
//		SingletonDemo s2= new SingletonDemo();
//		SingletonDemo s3= new SingletonDemo();
//		SingletonDemo s4= new SingletonDemo();
//		SingletonDemo s5= new SingletonDemo();
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
//		System.out.println(s4.hashCode());
//		System.out.println(s5.hashCode());
	}
}
