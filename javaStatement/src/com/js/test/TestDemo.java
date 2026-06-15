package com.js.test;

public class TestDemo {
	public static void main(String[] args) {
		
		Runnable ra1 = new R1();
		Runnable ra2 = new R2();
		Thread t1=new Thread(ra1);
		Thread t2=new Thread(ra2);

		t1.start();
		t2.start();
	}
}
	