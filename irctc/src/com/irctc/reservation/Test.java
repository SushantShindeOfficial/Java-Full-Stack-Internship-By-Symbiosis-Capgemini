package com.irctc.reservation;

public class Test {
	
	{
		System.out.println("This is Non-static block of test class..");
	}
	static {
		System.out.println("This is Static block of test class..");
		
	}
	
	public Test() {
		System.out.println("This is Constructor of test class..");
	}
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test();
	}
}
