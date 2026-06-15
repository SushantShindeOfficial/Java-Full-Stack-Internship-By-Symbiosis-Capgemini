package com.irctc.onlinebooking;

public class Client {
	{
		
		System.out.println("This is non static Block 1");
	}
	{
		System.out.println("This isnon static Block 2");
	}
	static{
		
		System.out.println("This is Static Block 1");
	}
	static{
		System.out.println("This is Static Block 2");
	}
	
	public static void main(String[] args) {
		Client c1=new Client();
		Client c2=new Client();
	
	}
}
