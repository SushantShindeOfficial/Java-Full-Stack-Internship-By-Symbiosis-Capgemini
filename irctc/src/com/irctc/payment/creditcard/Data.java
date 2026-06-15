package com.irctc.payment.creditcard;

public class Data {
	static {
		
		System.out.println("This is static block of Data block");
	}
	
	{
		System.out.println("This is non-static block of Data block");
	}
	
	public Data() {
		System.out.println("This is Constructor of Data class");
	}
		
	

}
