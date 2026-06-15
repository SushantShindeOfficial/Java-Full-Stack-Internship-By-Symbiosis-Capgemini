package com.irctc.payment.creditcard;
//Continue in Inheritance

public class Test {
	static {
		
		System.out.println("This is static block of Test block");
	}
	
	{
		System.out.println("This is non-static block of Test block");
	}
	
	public Test() {
		System.out.println("This is Constructor of Test class");
	}
	public static void main(String[] args) {
		Data d1=new Data(); 
		Test t1=new Test();
		Data d2=new Data(); 
		Test t2=new Test();
	}

}
