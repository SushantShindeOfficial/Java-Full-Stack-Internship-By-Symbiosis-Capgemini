package com.multiThreading.Example;

public class P2 extends Thread {
	public void run() {
		for(int i=50;i<100;i++) {
			System.out.println(i);
		}
	}
}
