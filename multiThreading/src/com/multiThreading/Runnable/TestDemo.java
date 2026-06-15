package com.multiThreading.Runnable;

public class TestDemo {
	public static void main(String[] args) {
		p1 P1=new p1();//5
		p2 P2=new p2();//we can set betn 1-10
		
		P1.setPriority(1);
		
		System.out.println(P1.getPriority());
		System.out.println(P2.getPriority());
		
//		P1.start();
//		P2.start();
		
		System.out.println(P1.MIN_PRIORITY);//1
		System.out.println(P1.NORM_PRIORITY);//5
		System.out.println(P1.MAX_PRIORITY);//10
	}
}
