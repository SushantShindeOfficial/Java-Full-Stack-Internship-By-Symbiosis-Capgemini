package com.javaStatements.ThreadGroup.demo;

public class Test {
	public static void main(String[] args) {
		Data d1=new Data();
		Demo d2=new Demo();
		Parent d3=new Parent();
		Product d4=new Product();
		
		ThreadGroup t1=new ThreadGroup("ABC");
		Thread tt=new Thread(t1,d4);
		tt.start();
		
		Thread tt1=new Thread(t1,d3);
		tt1.start();
		
		ThreadGroup t12=new ThreadGroup("PQR");
		
		Thread tt11=new Thread(t12,d1); 
		Thread t31=new Thread(t12,d2);
		
//		t1.stop();
//		
//		System.out.println(t1.getName());
//		System.out.println(t12.getName());
		
		
		
		
	}
}
