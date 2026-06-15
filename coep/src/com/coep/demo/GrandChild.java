package com.coep.demo;

public class GrandChild extends p1{
	static {
		System.out.println("Static block of Child");
	}
	{
		System.out.println("Non-Static block of Child");
	}
	public static void main(String[] args) {
		System.out.println("This is Main method");
	}
	
	public GrandChild() {
		System.out.println("Constructor of Child");
	}
	
	
}
