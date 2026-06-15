package com.amazon.etch;

public class Child extends Parent {
	public Child() {
		super(10); //by default there is a super keyword we define or not 
		System.out.println("Child Class ");
	}
	
	public Child(int x) {
		this(); //by default there is a super keyword we define or not 
		System.out.println("Child Parameterized Constructor "+x);
		
	}
}
