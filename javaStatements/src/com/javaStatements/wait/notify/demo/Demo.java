package com.javaStatements.wait.notify.demo;

public class Demo extends Thread{
	Product p1;
	public Demo(Product p1) {
		super();
		this.p1=p1;
	}
	public void run() {
		synchronized (p1) {
			System.out.println("Hii Start");
			System.out.println("");
		}
	}
}
