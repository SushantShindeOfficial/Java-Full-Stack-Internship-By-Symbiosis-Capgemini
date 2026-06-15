package com.multiThreading.Runnable;

public class Parent implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++) {
			System.out.println(i);
		}
	}

}
