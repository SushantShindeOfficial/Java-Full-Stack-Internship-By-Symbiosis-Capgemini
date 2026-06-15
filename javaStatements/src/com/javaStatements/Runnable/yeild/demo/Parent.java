package com.javaStatements.Runnable.yeild.demo;

public class Parent implements Runnable {
	public void run() {
		for(int i=0;i<=20;i++) {
			System.out.println(i);
			Thread.yield();
		}
	}
}
