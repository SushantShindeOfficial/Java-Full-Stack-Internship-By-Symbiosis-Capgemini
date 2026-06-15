package com.multiThreading.insurance;

public class Test {
	public static void main(String[] args)  throws InterruptedException {
		Demo d1 = new Demo();
		Demo d2 = new Demo();

		d1.display();
		d1.demo();
		d2.display();
		d2.demo();

		System.out.println(d1.getName());
		System.out.println(d2.getName());

//		String ds1 = Demo.currentThread().getName();
//		String ds2 = Demo.currentThread().getName();
//		System.out.println(ds1);
//		System.out.println(ds2);
	}
}
