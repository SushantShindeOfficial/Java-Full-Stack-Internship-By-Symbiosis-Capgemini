package com.loan.dept;

public class SingletonDemo {

	//private static SingletonDemo obj=new SingletonDemo();//eagar initialization of object
	
	private static SingletonDemo obj=null;
	
	private SingletonDemo() {
		
	}
	
	public static SingletonDemo demo(){
		if(obj==null)
		obj=new SingletonDemo();//Lazy initialization of object
		return obj;
	}
		
//	private int id;
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
	
	
	
}