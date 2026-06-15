package com.MapDSComposition.demo;

import java.util.Properties;

public class PropertyTest {
	public static void main(String[] args) {
		Properties p1=new Properties();
		p1.put(1, "Pune");
		p1.put(2, "Satara");
		p1.put(3, "HYd");
		p1.put(4, "Mumbai");
		p1.put(5, "Delhi");
		p1.put(6, "Nagpur");
		
		System.out.println(p1.isEmpty());
//		System.out.println(p1);
//		p1.clear();
//		System.out.println(p1.remove(1));
//		System.out.println(p1.contains(2));
//		System.out.println(p1);
		
	}
}
