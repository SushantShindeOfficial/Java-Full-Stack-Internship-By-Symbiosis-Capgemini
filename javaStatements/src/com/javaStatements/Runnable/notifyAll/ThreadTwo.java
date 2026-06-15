package com.javaStatements.Runnable.notifyAll;


public class ThreadTwo implements Runnable{	
	Parent p1;

	public ThreadTwo(Parent p1) {
		super();
		this.p1 = p1;

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
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
