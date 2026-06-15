package com.coep.demo;

public class Child extends Parent {
	void display(float salary) {
		
	}
	public static void main(String[] args) {
		Parent c1=new Child();
		c1.display();
		c1.display(0);
		c1.display("Name");
	}
}
