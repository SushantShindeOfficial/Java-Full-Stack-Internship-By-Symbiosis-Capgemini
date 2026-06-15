package com.javaStatements.yieldM.demo;

public class Parent extends Thread{
	public void run() {
		for(int i=0;i<=20;i++) {
			System.out.println(i);
		}
	}
}
