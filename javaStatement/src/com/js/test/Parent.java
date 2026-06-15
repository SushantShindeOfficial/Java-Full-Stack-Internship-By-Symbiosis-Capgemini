package com.js.test;

public class Parent {
	public synchronized void demo() {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
	}
}
