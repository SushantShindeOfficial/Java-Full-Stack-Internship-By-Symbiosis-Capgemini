package com.homework4.java.demo.entity;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Product> list = new ArrayList<Product>();

		System.out.println("Enter Limit");

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Enter Product Id");

			int pid = sc.nextInt();

			System.out.println("Enter Product Name");

			String pname = sc.next();

			System.out.println("Enter Category Id");

			int cid = sc.nextInt();

			System.out.println("Enter Category Name");

			String cname = sc.next();

			Category c = new Category(cid, cname);

			Product p = new Product(pid, pname, c);

			list.add(p);
		}

		// ARRAYLIST

		System.out.println("ARRAYLIST DATA");

		for (Product p : list) {

			System.out.println(p);
		}

		// TREESET

		TreeSet<Product> set = new TreeSet<Product>(list);

		System.out.println("TREESET DATA");

		for (Product p : set) {

			System.out.println(p);
		}
	}
}
