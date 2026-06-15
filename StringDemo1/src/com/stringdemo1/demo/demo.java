package com.stringdemo1.demo;

public class demo {
	public static void main(String[] args) {
		
		String s1="WelCome to Dubaii";
		System.out.println(s1.codePointCount(0, s1.length()));
		System.out.println(s1.length());
		
		
		StringBuilder sb=new StringBuilder("WelCome to Dubaii");
		System.out.println(sb.codePointCount(0, sb.length()));
		System.out.println(sb.length());
		
		StringBuffer sf=new StringBuffer("WelCome to Dubaii");
		System.out.println(sf.codePointCount(0, sf.length()));
		System.out.println(sf.length());
	}
}
