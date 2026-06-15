package com.coep.demo;

public class p1 {
	static {
		System.out.println("Static Block of Parent");
	}
	{
		System.out.println("Non-Static block of Parent");
	}
	public p1() {
		System.out.println("Parent Constructor");
	}
	
}
