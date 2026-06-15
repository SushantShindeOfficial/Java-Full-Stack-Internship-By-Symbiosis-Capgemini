package com.js.login;

public class DemoTest {
	public static void main(String[] args) {
		System.out.println("Program start here");
		int i = 100;

		// it can execute block of code and after thAT check Condition
		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i--; // decrement
		} while (i >= 1);
		System.out.println("End of Program");
	}
}
