package com.javaStatementscom.login.demo;

public class Parent {
	public static synchronized void data() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}
