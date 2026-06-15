package com.js.multiThreading;

public class Test {
	public static void main(String[] args) {
		Demo d1=new Demo();
		Data dd1=new Data();
		
		//Higher Priority Case is executed First
		
		d1.setPriority(10);
		dd1.setPriority(1);
		
		d1.start();
		dd1.start();
		
	}
}
