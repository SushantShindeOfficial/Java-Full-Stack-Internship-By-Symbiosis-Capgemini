package com.js.multiThreading;

public class Data extends Thread{
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println(i);
		}
		
	}
}
