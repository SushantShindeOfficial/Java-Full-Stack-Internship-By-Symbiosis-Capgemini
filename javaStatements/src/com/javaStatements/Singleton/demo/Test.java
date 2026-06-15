package com.javaStatements.Singleton.demo;

public class Test {
	public static void main(String[] args) {
		Demo d1=new Demo();
		Demo d2=new Demo();
		d1.start();
		d2.start();
	}
}
