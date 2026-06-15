package com.javaStatements.yieldM.demo;

public class Demo extends Thread{
	public void run() {
		for(int i=200;i<=220;i++) {
			System.out.println(i);
			//Thread.yield();
		}
	}
}
