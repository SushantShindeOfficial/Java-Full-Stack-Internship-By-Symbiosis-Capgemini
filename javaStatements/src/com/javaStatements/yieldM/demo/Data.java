package com.javaStatements.yieldM.demo;

public class Data extends Thread {
	public void run() {
		for(int i=100;i<=120;i++) {
			System.out.println(i);
		}
	}
}
