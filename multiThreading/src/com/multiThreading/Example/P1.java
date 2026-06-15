package com.multiThreading.Example;

public class P1 extends Thread{
	public void run() {
		for(int i=1;i<50;i++) {
			System.out.println(i);
		}
	}
}
