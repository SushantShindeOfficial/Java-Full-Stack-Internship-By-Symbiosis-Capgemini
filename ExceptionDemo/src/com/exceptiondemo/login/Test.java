package com.exceptiondemo.login;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	//it is mandatory that after try block we have to define catch block or finally block
	//one try block and multiple catch blocks are allowed but Generic catch block must be in Last 
	//we cant put any kind of Business logic between Try-catch block
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		try {
			
			System.out.println("Emp Id: ");
			int id=s1.nextInt();
			System.out.println("Emp Name: ");
			String name=s1.next();
			System.out.println("Emp Address: ");
			String address=s1.next();
			System.out.println("Emp Salary: ");
			float salary=s1.nextFloat();
			
		
			System.out.println("Emp ID: "+id);
			System.out.println("Emp Name is: "+name);
			System.out.println("Emp Address: "+address);
			System.out.println("Emp Salary: "+salary);
			
		} catch (InputMismatchException e) {
			
			System.out.println("Plz Enter Proper Input");
		} catch (Exception e) {
			
			System.out.println("Handle all Exceptions");
		}
		
		finally {
			
			System.out.println("Thankss..!!");
		}
		
		
	}
}
