package com.amazon.login;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		StudentBusiness s1=new StudentBusiness();
		Admin a1=new Admin();
		techinfo t1=new techinfo();
		
		Scanner s=new Scanner(System.in);
		System.out.println("College Management System");
		
		System.out.println("1. Admin");
		System.out.println("2. Student business");
		System.out.println("3. Non Teaching ");
		System.out.println("4. Student");
		System.out.println("Enter your Choice");
		int choice=s.nextInt();
		switch (choice) {
		case 1: {
			
			s1.getData();
			s1.displayData();
		}
		
		case 2: {
			
			a1.getData();
			a1.displayData();
		}
		
		case 3: {
			
			t1.getData();
			t1.displayData();
		}
		
		
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		
	}
}
