package com.collection.demo.array;

import java.util.Scanner;

public class PrintGreatestEleInArray {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		// Input for arry size
		System.out.println("Enter Array Size:  ");
		int size = sc.nextInt();
		Integer arr[] = new Integer[size];
		Integer arr2[] = new Integer[size];
		int MaxElement = 0;
		int counter = 0;

		// Taking inputs for ele
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter your" + i + "Element: ");
			int ele = sc.nextInt();
			arr[i] = ele;
		}

		// For Checking Max ELe and getting it's Position
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= MaxElement) {
				MaxElement = arr[i];
				arr2[counter] = i;
				counter++;
			} else {
				arr2[i] = 0;
			}

		}

		System.out.print("The Greatest No is :" + MaxElement + " At ");

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] != 0) {
				System.out.print(" " + i + ",");
			}
		}

		//

	}
}
