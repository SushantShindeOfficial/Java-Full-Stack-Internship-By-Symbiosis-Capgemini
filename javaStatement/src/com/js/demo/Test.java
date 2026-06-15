package com.js.demo;

public class Test {
	public static void main(String[] args) {
		Runnable r1 = new Data();
		Runnable r2 = new Demo();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

//		t1.stop();
//		t1.suspend();
//		t1.resume();
//		t1.interrupted();//Waiting state

	}
}
