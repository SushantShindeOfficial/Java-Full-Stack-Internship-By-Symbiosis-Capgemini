package com.mapds.demo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		
	
		Map m1=new HashMap();
		m1.put(1,"fnvb");
		m1.put(2, "dgfsgf");
		m1.put(3,"fnvbdg");
		m1.put(4, "dgfdsh");
		m1.put(5,"fnvbsgd");
		m1.put(true, "dgffgnf");
		m1.put(7,"fnhrhhsvbthbe");
		m1.put("8", "dsdhgf");
		m1.put(9,"dhfnhvb");
		m1.put(10f, "ddhghf");
		
		System.out.println(m1);
		System.out.println(m1.containsKey(9));
		System.out.println();
		
		
	}
}
