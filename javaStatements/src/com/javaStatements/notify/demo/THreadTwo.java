package com.javaStatements.notify.demo;

public class THreadTwo extends Thread {
	Parent p1;

	public THreadTwo(Parent p1) {
		super();
		this.p1 = p1;

	}

	public void run() {
		synchronized (p1) {
			System.out.println("We are in thread two");
			System.out.println("THread twon execution start");
			try {
				System.out.println("Waiting state of thread two");
				p1.wait();
				System.out.println("Back to THread Two");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("THread two Execution Done");
			p1.notifyAll();
		}
	}

}
