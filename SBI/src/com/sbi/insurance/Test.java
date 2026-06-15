package com.sbi.insurance;

public class Test {
	public static void main(String[] args) {
		Demo d1=new Demo();
		String s=d1.display("Sham");
		System.out.println(s);
		int y=d1.data(24);
		System.out.println(y);
		
		Demo ddDemo=d1.getData(d1);
		System.out.println(ddDemo);
	}
}
