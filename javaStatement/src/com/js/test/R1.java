package com.js.test;

public class R1 implements Runnable {
	public synchronized void demo() {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
