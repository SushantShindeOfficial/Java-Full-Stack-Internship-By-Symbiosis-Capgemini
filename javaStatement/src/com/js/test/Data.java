package com.js.test;

public class Data extends Thread {
	
	//Composition is used
	Parent p1;//loosly coupled code,
	
	public Data(Parent p1) {
		super();
		this.p1=p1;
	}
	public void run() {
		p1.demo();
	}
		
		
	
}
