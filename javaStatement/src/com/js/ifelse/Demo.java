package com.js.ifelse;

import java.util.Scanner;

public class Demo {
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		// Taking input
//		System.out.print("Enter first number: ");
//		int a = sc.nextInt();
//
//		System.out.print("Enter second number: ");
//		int b = sc.nextInt();
//
//		System.out.print("Enter third number: ");
//		int c = sc.nextInt();
//
//		int max;
//
//		// Finding biggest number
//		if (a >= b && a >= c) {
//			max = a;
//		} else if (b >= a && b >= c) {
//			max = b;
//		} else {
//			max = c;
//		}
//
//		// Output
//		System.out.println("Biggest number is: " + max);
//
//		sc.close();
//	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = sc.nextInt();

		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		System.out.print("Enter third number: ");
		int c = sc.nextInt();

		int max;
		int position;

		if (a >= b && a >= c) {
			max = a;
			position = 1;
		} else if (b >= a && b >= c) {
			max = b;
			position = 2;
		} else {
			max = c;
			position = 3;
		}

		System.out.println("Biggest number is: " + max);
		System.out.println("Position is: " + position);

		sc.close();
	}
}
