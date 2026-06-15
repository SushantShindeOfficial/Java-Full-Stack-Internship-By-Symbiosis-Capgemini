package com.rvn.login;

public class SingletonDemo {
	
	//private SingletonDemo s1=null;
	private static SingletonDemo s1=new SingletonDemo();//egar initilization
	private SingletonDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
//	int id=10;
//	void getData() {
//		System.out.println("Get data method");
//	}
	
	public static SingletonDemo data() {
		if(s1==null) {
			return s1=new SingletonDemo();//Lazy Loading
		}
		return s1;
	}
	
}
