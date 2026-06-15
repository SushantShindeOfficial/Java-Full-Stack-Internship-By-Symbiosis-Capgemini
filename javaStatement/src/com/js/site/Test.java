package com.js.site;

public class Test {
	public static void main(String[] args) {
		Parent p1=new Child();
		Child c1= new Child();
		Parent p2=new Parent();
		
		System.out.println(p1 instanceof Child);
		System.out.println(c1 instanceof Parent);
	}
}
