package com.js.multiThreading;

public class Demo extends Thread{
	public void run() {
		for (int i=51;i<60;i++) {
			System.out.println(i);
		}
		
	}
}
