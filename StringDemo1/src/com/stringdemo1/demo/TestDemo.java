package com.stringdemo1.demo;

public class TestDemo {
	public static void main(String[] args) {
//		Data d1=new Data("Java");
//		System.out.println(d1.getName());
		String string=new String("joey");
		String str =string.concat("Java");
		System.out.println(str);
		String s1="WelCome to Dubaii";
		System.out.println(s1.charAt(0));
//		String string2=null;
//		System.out.println(string2.charAt(0));
		
		StringBuilder sBuilder=new StringBuilder("Parbhani");
		sBuilder.append(" Kolkatta");
		System.out.println(sBuilder);
		
		StringBuffer stringBuffer=new StringBuffer("Surat");
		stringBuffer.append(" Vishakhaputtanaum");
		System.out.println(stringBuffer);
	}
}
