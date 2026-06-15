package com.collection.arrayList;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

public class Data {
	public static void main(String[] args) {
		
		//Any Data,Non-Generic Collection
//		List l1=new ArrayList();  
//		l1.add(10);
//		l1.add("abc");
//		l1.add("Satara");
//		l1.add(7.14f);
//		l1.add(true);
//		
//		System.out.println(l1);
		
		
		//Generic Collection
		List<Integer> l1=new ArrayList<Integer>();//GenericArrayType collection
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		
		System.out.println(l1);
		
	}
}
