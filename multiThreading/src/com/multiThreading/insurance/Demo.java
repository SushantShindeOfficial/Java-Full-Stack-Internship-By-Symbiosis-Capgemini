package com.multiThreading.insurance;

public class Demo extends Thread {
	void display() {
		System.out.println("This is display method");
	}

	void demo() throws InterruptedException {
		Thread.sleep(10000); // It prints after the 10 seconds.
		System.out.println("This is demo method");

	}
}
