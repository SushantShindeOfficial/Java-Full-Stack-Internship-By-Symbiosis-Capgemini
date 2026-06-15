package com.multiThreading.Example;

public class Test {
	public static void main(String[] args) {
		P1 p1=new P1();
		P2 p2=new P2();
		P3 p3=new P3();
		
		p1.setPriority(4);
		p2.setPriority(5);
		p3.setPriority(6);
		
		System.out.println(p1.getPriority());
		System.out.println(p2.getPriority());
		System.out.println(p3.getPriority());
		
		System.out.println(p1.MIN_PRIORITY);//1
		System.out.println(p1.NORM_PRIORITY);//5
		System.out.println(p1.MAX_PRIORITY);//10
		
		System.out.println(p2.MIN_PRIORITY);//1
		System.out.println(p2.NORM_PRIORITY);//5
		System.out.println(p2.MAX_PRIORITY);//10
		
		System.out.println(p3.MIN_PRIORITY);//1
		System.out.println(p3.NORM_PRIORITY);//5
		System.out.println(p3.MAX_PRIORITY);//10
	}
}
