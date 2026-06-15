package com.js.ifelse;

public class AlterStar {
//	public static void main(String[] args) {
//
//		int count = 1;
//
//		for (int i = 1; i <= 9; i++) {
//
//			if (i % 2 == 0) {
//				// print multiple stars
//				for (int j = 1; j <= count + 1; j++) {
//					System.out.print("*");
//				}
//				count++; // increase star count
//			} else {
//				// print single star
//				System.out.print("*");
//			}
//
//			System.out.println(); // move to next line
//		}
//	}

	public static void main(String args[]) {
		int i, j;
		int n = 9;
		int counter = 0;
		for (i = 1; i < n; i++) {
			System.out.println("*");

			if (i % 2 == 0 && i != 2) {
				counter++;
				for (j = 0; j < counter; j++) {
					System.out.print("*");
				}
			}

		}
	}
}
