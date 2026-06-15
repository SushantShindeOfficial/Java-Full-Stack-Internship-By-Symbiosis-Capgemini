package com.js.test;

public class Test {
	public static void main(String[] args) {
		Parent p1=new Parent();
		Data d1=new Data(p1);
		Data d2=new Data(p1);
		d1.start();
		d2.start();
	}
}
