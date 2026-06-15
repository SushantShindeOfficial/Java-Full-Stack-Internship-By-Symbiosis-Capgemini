package com.collection.stack.demo;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Demo extends Thread{
	public void run() {
		Vector<Integer> l1=new Vector<Integer>();
		
//		l1.add(10);
//		l1.add(20);
//		l1.add(30);
//		l1.add(40);
//		l1.add(50);
//		l1.add(60);
//		System.out.println(l1.firstElement());
//		System.out.println(l1.lastElement());	
//		for(int i=0;i<l1.size();i++) {
//			System.out.println(l1.get(i));
//		}
		
		
		Stack s1=new Stack<Integer>();
		s1.push(10);
		s1.push(20);
		s1.push("CSS");
		s1.add("java");
		s1.add(2004);
		
		System.out.println(s1.peek());
		System.out.println(s1.firstElement());
		System.out.println(s1.lastElement());
		
	}
}
