package com.javaStatements.notify.demo;

public class ThreadOne extends Thread {

	Parent p1;

	public ThreadOne(Parent p1) {
		super();
		this.p1 = p1;
	}

	public void run() {
		synchronized (p1) {
			System.out.println("THreadOne");
			System.out.println("Execution");
			try {
				p1.wait();
				System.out.println("Weak Area back");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("Execution Deone");
		}
	}
}
