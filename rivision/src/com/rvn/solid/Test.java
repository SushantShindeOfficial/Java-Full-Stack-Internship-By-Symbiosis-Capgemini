package com.rvn.solid;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("++++++++------------Employee Managemnt System-----------++++++++++");

		System.out.println("1. Employee add ");
		System.out.println("2. Employee Update ");
		System.out.println("3. Employee Delete ");
		System.out.println("4. Employee Managemnt System");
		System.out.println("--------------Enter your Choice:-----------");
		Scanner s1=new Scanner(System.in);
		int x=s1.nextInt();
		switch (x) {
		case 1: {
			CreateService a1=new add();
			a1.addEmployee();
			System.out.println("Employee add Sucess ");
			break;
		}
		case 2: {
			delete d1=new delete();
			d1.deleteEmployee(x);
			System.out.println("Employee delete Sucess");
			break;
		}
		case 3: {
			update u1=new update();
			u1.updateEmployee(x);
			System.out.println("Employee Upadte Sucess");
			break;
		}
		case 4: {
			fetch f1=new fetch();
			f1.fetchEmployee();
			System.out.println("Employee fetch Sucess");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + x);
		}
	}
}
