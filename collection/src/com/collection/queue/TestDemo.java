package com.collection.queue;

import java.util.PriorityQueue;

public class TestDemo {
	public static void main(String[] args) {
		PriorityQueue p1=new PriorityQueue();
		PriorityQueue p2=new PriorityQueue();
		PriorityQueue p3=new PriorityQueue();
		PriorityQueue p4=new PriorityQueue();
		PriorityQueue p5=new PriorityQueue();
//		p1.add(10);
//		p1.add(2);
//		p1.add(30);
//		p1.add(40);
//		p1.add(50);
//		p1.add(6);
//		p1.add(70);
//		p1.remove();
//		p1.remove();
		
		p1.add("ABC");
		p1.add("abc");
		p1.add("PQR");
		p1.add("pqr");
		p1.add("SRC");
		
		p2.add("Part");
		p2.add("Java");
		p2.add("CSS");
		p2.add("JS");
		
		p3.add("Part");
		p3.add("Java");
		p3.add("CSS");
		p3.add("JS");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
	}
}
