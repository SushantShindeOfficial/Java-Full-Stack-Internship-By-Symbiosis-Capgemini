package com.javaStatements.notify.demo;

public class Test {
	public static void main(String[] args) {
		Parent p1=new Parent();
		ThreadOne t1=new ThreadOne(p1);
		THreadTwo t2=new THreadTwo(p1);
		ThreadThree t3=new ThreadThree(p1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
