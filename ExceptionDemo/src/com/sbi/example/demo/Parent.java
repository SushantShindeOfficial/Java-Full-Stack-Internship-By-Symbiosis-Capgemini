package com.sbi.example.demo;


public class Parent {
	void display() {
		System.out.println("This is Display Method");
		class Demo{
			void show() {
				System.out.println("This show method");
			}
		}
		
		Demo d1Demo=new Demo();
		d1Demo.show();
	}
}
