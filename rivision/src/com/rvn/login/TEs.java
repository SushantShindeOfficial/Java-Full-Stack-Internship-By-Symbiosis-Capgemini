package com.rvn.login;

public class TEs {
	public static void main(String[] args) {
		
//		SingletonDemo s1=new SingletonDemo();
//		System.out.println(s1.id);
//		s1.getData();
//		SingletonDemo s2=new SingletonDemo();
//		SingletonDemo s3=new SingletonDemo();
//		
//		System.out.println("Val. of s1: "+s1.hashCode());
//		System.out.println("Val. of s2: "+s2.hashCode());
//		System.out.println("Val. of s3: "+s3.hashCode());
		
		SingletonDemo s1=SingletonDemo.data();
		
		SingletonDemo s2=SingletonDemo.data();
		System.out.println("Val. of s1: "+s1.hashCode());
		System.out.println("Val. of s2: "+s2.hashCode());
		
	}
	
}
