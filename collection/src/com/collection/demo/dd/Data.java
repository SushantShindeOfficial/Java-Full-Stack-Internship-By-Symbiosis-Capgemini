package com.collection.demo.dd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Data extends Thread {
	public void run() {
		List<Integer> l1 = new ArrayList<Integer>();

		l1.add(10);
		l1.add(30);
		l1.add(70);
		l1.add(90);
		l1.add(20);
		l1.add(60);

//		synchronized (l1) {
//			System.out.println(l1);
//		}

//		Iterator<Integer> i=l1.iterator();//traverse (loop through) a collection safely
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}

		ListIterator<Integer> i1 = l1.listIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		System.out.println("After Reverse");
		
		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}
	}
}
