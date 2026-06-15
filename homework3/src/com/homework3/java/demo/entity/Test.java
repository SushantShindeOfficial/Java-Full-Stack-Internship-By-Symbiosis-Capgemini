package com.homework3.java.demo.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		TreeSet<Employee> set = new TreeSet<Employee>();

		System.out.println("Enter Limit");

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Enter Id");
			int id = sc.nextInt();

			System.out.println("Enter Name");
			String name = sc.next();

			set.add(new Employee(id, name));
		}

		HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();

		for (Employee e : set) {

			map.put(e.id, e);
		}

		for (Map.Entry<Integer, Employee> m : map.entrySet()) {

			System.out.println(m.getKey());

			System.out.println(m.getValue());
		}
	}
}
