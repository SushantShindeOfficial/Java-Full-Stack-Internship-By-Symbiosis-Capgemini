package com.irctc.payment.upi;

public class Demo {
	//Non static block in java
	{
		System.out.println("This is non - Static block..");// this block execute when obj is created in program
			
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is main method..");
		Demo d1=new Demo();
		Demo d2=new Demo();
	}

}
