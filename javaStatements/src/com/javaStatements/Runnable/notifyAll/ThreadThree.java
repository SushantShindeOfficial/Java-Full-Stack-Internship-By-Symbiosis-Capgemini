package com.javaStatements.Runnable.notifyAll;


public class ThreadThree implements Runnable{
	
	
	Parent p1;

	public ThreadThree(Parent p1) {
		super();
		this.p1 = p1;

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (p1) {
			System.out.println("We are in thread Three");
			System.out.println("THread Three execution start");
			System.out.println("Thread 2 Execution done ");
			p1.notifyAll();
		}
		
	}

}
