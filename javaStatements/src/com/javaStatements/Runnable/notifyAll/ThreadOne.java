package com.javaStatements.Runnable.notifyAll;


public class ThreadOne implements Runnable{
	
	Parent p1;

	public ThreadOne(Parent p1) {
		super();
		this.p1 = p1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
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
