package com.js.multiThreading;

public class Child implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
