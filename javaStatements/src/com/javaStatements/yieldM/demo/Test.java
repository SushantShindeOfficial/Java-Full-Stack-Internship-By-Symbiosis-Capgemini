package com.javaStatements.yieldM.demo;

public class Test {
	public static void main(String[] args) {
		Parent p1=new Parent();
		Data d1=new Data();
		Demo dd1=new Demo();
		//dd1.setPriority(10);
		p1.start();
		d1.start();
		dd1.start();
		
	}
}
