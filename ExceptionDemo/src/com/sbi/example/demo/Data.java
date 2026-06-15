package com.sbi.example.demo;

public class Data {
	int x=10;
	class Client{
		
		int y=23;
		void display() {
			
			System.out.println(this.y);
			System.out.println(x);
			System.out.println("This is Dipslay method");
		}
	}
}
