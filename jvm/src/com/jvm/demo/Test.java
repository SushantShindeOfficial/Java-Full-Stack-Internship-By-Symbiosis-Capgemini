package com.jvm.demo;

public class Test {
	int id=10;
	void demo() {
		System.out.println("this is demo method of Test Class");
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Test t1=(Test) Class.forName("com.jvm.demo.Test").newInstance();
		
		System.out.println(t1.id);
		t1.demo();
	}
}
