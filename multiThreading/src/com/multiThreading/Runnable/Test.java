package com.multiThreading.Runnable;

public class Test {
	public static void main(String[] args) {
		Runnable r1=new Parent();
		Runnable r2=new Parent();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
//		t1.start();
//		t2.start();
		
		t1.start();
		t2.start();
		
//		t1.start();we can start one thread at only once 
//		t1.start();
	}
}
