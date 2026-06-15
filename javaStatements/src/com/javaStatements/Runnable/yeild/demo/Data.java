package com.javaStatements.Runnable.yeild.demo;

public class Data implements Runnable{
	public void run() {
		for(int i=100;i<=120;i++) {
			System.out.println(i);
			Thread.yield();
		}
	}
}
