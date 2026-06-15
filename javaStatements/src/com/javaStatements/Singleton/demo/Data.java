package com.javaStatements.Singleton.demo;

public class Data {
	private static Data d1=null;
	private Data(){
		
	}
	
	public synchronized static Data getData() {
		if(d1==null) {
			//Single Check
			if(d1==null) {
				//Double Check
				d1=new Data();
			}
		}
		return d1;
	}
}
