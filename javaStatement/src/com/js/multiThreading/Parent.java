package com.js.multiThreading;

public class Parent implements Runnable {
	public void run() {
		for (int i = 11; i <= 20; i++) {
			System.out.println(i);
		}
	}

}