package com.sbi.login;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		try {
			System.out.println("Outer Try Block");
			System.out.println("Enter 1st No");
			int a=s1.nextInt();
			try {
				System.out.println("Inner Try Block");
				System.out.println("Enter 2nd no");
				int b=s1.nextInt();

				try {
					System.out.println("Inner Inner Block");
					int c=a/b;
					System.out.println("Result is "+c);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Inner inner Catch block");
				}
				finally {
					System.out.println("Inner Inner Finally Block");
				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Inner Catch block");
			}
			finally {
				System.out.println("Inner Finally Block");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Outer Catch block");
		}
		finally {
			System.out.println("Outer Finally Block");
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			finally {
				try {
					
				} catch (Exception e3) {
					// TODO: handle exception
					try {
						
					} catch (Exception e4) {
						// TODO: handle exception
					}
					finally {
						try {
							
						} catch (Exception e5) {
							// TODO: handle exception
						}
					}
				}
			}
		}
	}


}
