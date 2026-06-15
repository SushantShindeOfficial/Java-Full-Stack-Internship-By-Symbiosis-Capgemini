package com.flipcart.headphones;

public class Demo {
	final static int a=23;//in class level we have to define the value at that line
	void display() {
		//System.out.println(a=23);
		final int x;//we can define val into method only once 
		x=12345;
		System.out.println(x);
	}
	public static void main(String[] args) {
		Demo d1=new Demo();
		System.out.println(d1.a);
		d1.display();
		
	}
}
