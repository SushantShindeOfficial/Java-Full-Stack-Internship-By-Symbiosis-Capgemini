package com.flipcart.headphones;

public class Data {
	int a;
	void demo() {
		System.out.println(this.a=50);
	}
	static void display() {
		Data d1=new Data();
		System.out.println(d1.a=100);
	}
	public static void main(String[] args) {
		Data d1=new Data();
		System.out.println(d1.a=200);
	}
}
