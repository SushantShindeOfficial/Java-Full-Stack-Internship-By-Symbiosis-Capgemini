package com.irctc.login;

public class Client {

	
	  { 
		  //Non-Static block in java
		  System.out.println("This is Non-Static block...");
	  
	  }
	 
	  static{
	  
		  
		  //static block 
		  System.out.println("This is Static block..."); //eagar loading
	  
	  }
	 
	
	public static void main(String[] args) {
		
		System.out.println("This is Main Method");
	}

}
