package com.javaStatements.notify.demo;

public class ThreadThree extends Thread{
	Parent p1;

	public ThreadThree(Parent p1) {
		super();
		this.p1 = p1;

	}

	public void run() {
		synchronized (p1) {
			System.out.println("We are in thread Three");
			System.out.println("THread Three execution start");
			System.out.println("Thread 2 Execution done ");
			p1.notifyAll();
		}
	}
}
