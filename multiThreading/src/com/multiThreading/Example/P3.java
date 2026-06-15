package com.multiThreading.Example;

public class P3 extends Thread{
	public void run() {
		for(int i=100;i<200;i++) {
			System.out.println(i);
		}
	}
}
