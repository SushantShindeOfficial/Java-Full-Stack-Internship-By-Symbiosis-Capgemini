package com.collection.genericdata.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDemo {
	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>();

		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);

		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(50);
		l2.add(60);
		l2.add(70);
		l2.add(80);

		l2.addAll(l1);// add all elements from one collection into another collection

//		l2.removeAll(l1);//remove from one collection all elements that are present in another collection

		l2.clear();// remove all elements from a collection

//		l2.add(1, 555);
		System.out.println(l2);

//		System.out.println(l1);

		// access data using simple for loop
//		for (int i=0;i<l1.size();i++){
//			System.out.println(l1.get(i));
//		}

		// access data using for-each Loop
//		for (Integer i1:l1) {
//			System.out.println(i1);
//		}

		// check whether a collection contains a specific element or not.
		System.out.println(l1.contains(10));

		// delete elements from a collection
		// System.out.println(l1.remove(l1));
		
	}
}
