package com.multiThreading.RunableI;

public class Parent extends Thread implements Runnable {
	public void run() {
		for (int i=1;i<10;i++) {
			System.out.println(i);
		}
	}
}
