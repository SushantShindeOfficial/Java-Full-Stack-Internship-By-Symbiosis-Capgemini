package com.js.multiThreading;

public class TestDemo {
	public static void main(String[] args) {
		
		Parent p1=new Parent();
		Child c1=new Child();
		Thread t1 = new Thread(p1); // pass runnable
		Thread t2 = new Thread(c1);
        
		Runnable r1=new Child();
		t1.setPriority(10);
		t2.setPriority(1);
		
		t1.start(); 
        t2.start();
        
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        
        System.out.println(p1);
	}
}
