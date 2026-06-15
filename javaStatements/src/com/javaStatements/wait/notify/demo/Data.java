package com.javaStatements.wait.notify.demo;

public class Data extends Thread {
	Product p1;
	public void run() {
		
		try {
			
			System.out.println("Thread Execution start ");
			System.out.println("We are going in waiting State");
			p1.display();
			wait();
			
			System.out.println("we are back");
			p1.notify();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Execution donnne");
	} 
}
