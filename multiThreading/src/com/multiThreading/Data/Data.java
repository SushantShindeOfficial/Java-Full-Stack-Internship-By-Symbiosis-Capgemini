package com.multiThreading.Data;

public class Data extends Thread {
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(i);
		}
	}
	public void demo() {
		for(int i=0;i<100;i++) {
			System.out.println(i);
		}
	}
}
