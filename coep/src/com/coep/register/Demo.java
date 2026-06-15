package com.coep.register;

public class Demo {
	int x;
	public Demo(int x) {
		this.x=x;
		
	}
	
	public Demo(Demo demo) {
		this.x=demo.x;
	}
	void display() {
		System.out.println(this.x);
	}
}
