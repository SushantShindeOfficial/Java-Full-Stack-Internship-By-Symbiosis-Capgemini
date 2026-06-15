package com.collection.genericdata.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		e1.setName("sdf");
		e1.setDob("asdf");
		e1.setId(1);
		e1.setAdd("Satara");
		
		e2.setName("cxvd");
		e2.setDob("sdcfv");
		e2.setId(2);
		e2.setAdd("erfffw");	
		
		e3.setName("af");
		e3.setDob("b");
		e3.setId(2);
		e3.setAdd("nf");
		
		
		List<Employee> l1=new ArrayList<Employee>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		
		System.out.println(l1);
	}
}
