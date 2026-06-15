package com.coep.demo;

public class ChildDemo extends p1 {
	static {
		System.out.println("Static block of Child");
	}
	{
		System.out.println("Non-Static block of Child");
	}
	public static void main(String[] args) {
		System.out.println("This is Main method");
	}
	
	public ChildDemo() {
		System.out.println("Constructor of Child");
	}
}
