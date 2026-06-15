package com.multiThreading.Runnable;

public class p2 extends Thread {
	public void run() {
		for(int i=100;i<500;i++) {
			System.out.println(i);
		}
	}
}
