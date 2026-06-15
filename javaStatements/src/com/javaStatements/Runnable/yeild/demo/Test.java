package com.javaStatements.Runnable.yeild.demo;

public class Test {
	public static void main(String[] args) {
		Runnable d1=new Data();
		Runnable p1=new Parent();
		Runnable dd1=new Demo();
		
		Thread t1=new Thread(d1);
		Thread t2=new Thread(p1);
		Thread t3=new Thread(dd1);
		t1.start();
		t2.start();
		t3.start();				

		
	}
}
