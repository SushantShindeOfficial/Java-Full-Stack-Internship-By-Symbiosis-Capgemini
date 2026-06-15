//package com.collection.demo.array;
//
//import java.util.Scanner;
//
//public class TestDemo {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("------------ Find The Greater From the Three ----------");
//		
//		System.out.println("Enter 1st No: ");
//		int a=sc.nextInt();
//		
//		System.out.println("Enter 2st No: ");
//		int b=sc.nextInt();
//		
//		System.out.println("Enter 3st No: ");
//		int c=sc.nextInt();
//		
//		if (a>b && a>c) {
//			System.out.println(a+" is Greater");
//		}
//		else if (b>a && b>c) {
//			System.out.println(b+" is Greater");
//		}
//		else {
//			System.out.println(c+" is greater");
//		}
//		
//			
//	}
//}

package com.collection.demo.array;

import java.util.Scanner;

public class TestDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("------------ Find The Greatest From Three ----------");
		
		System.out.println("Enter Size of Array: ");
		int e=sc.nextInt();
		
		int arr[] = new int[e];

		// Taking input using loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		// Assume first element is greatest
		int max = arr[0];

		// Compare using loop
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			
		}

		System.out.println(max + " is Greater");
	}
}
