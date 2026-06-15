package com.javaStatements.Singleton.demo;

public class Demo extends Thread{
	public void run() {
		Data d1=Data.getData();
		System.out.println(d1.hashCode());
	}
}
