package com.javaStatements.Runnable.notifyAll;


public class Test {
	public static void main(String[] args) {
		
		Parent p1=new Parent();
		Runnable r1=new ThreadOne(p1);
		Runnable r2=new ThreadTwo(p1);
		Runnable r3=new ThreadThree(p1);
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
