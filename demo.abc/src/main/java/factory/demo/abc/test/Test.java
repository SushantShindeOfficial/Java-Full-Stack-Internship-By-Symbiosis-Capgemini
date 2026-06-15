package factory.demo.abc.test;

import java.util.Scanner;

import factory.demo.abc.factory.Factory;

public class Test {
	public static void main(String[] args) {

		while (true) {
			System.out.println("Product Management System");
			System.out.println("Enter your Choice ");
			System.out.println("1. Add Product");
			System.out.println("2. Delete Product");
			System.out.println("3. Fetch Product ");
			System.out.println("4. Update Product ");
			Scanner s1 = new Scanner(System.in);
			int x = s1.nextInt();
			Factory f1 = new Factory(x);

		}
	}
}
