package com.irctc.status;
// Access static method in other class's main method ,it gives preference to the test class if both classes have a static block   
public class Test {
	static 
	{
		System.out.println("This is Static block of Test.java...");		
	}
	
	public static void main(String[] args) {
		System.out.println("This is this is main method...");
		Demo d1=new Demo();
	}
	
}
