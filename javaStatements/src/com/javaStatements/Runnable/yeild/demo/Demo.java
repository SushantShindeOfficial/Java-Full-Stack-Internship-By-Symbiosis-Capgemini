package com.javaStatements.Runnable.yeild.demo;

public class Demo implements Runnable{
	public void run() {
		for(int i=200;i<=220;i++) {
			System.out.println(i);
			Thread.yield();
		}
	}
}	
