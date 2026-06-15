package com.amazon.etch;

public class Parent {
	public Parent() {
		super();
		System.out.println("Parent Class ");
	} 
	
	public Parent(int y) {
		this();
		System.out.println("Parent Parameterized Class "+y);
	}
}
