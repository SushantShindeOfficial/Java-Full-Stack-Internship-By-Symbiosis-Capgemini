package com.multiThreading.Runnable;

public class p1 extends Thread {
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(i);
		}
	}
}
