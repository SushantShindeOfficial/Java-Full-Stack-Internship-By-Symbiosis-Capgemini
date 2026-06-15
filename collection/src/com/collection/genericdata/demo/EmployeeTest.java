package com.collection.genericdata.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeDemo e1 = new EmployeeDemo();
		EmployeeDemo e2 = new EmployeeDemo();
		EmployeeDemo e3 = new EmployeeDemo();

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
		e3.setId(3);
		e3.setAdd("nf");

		List<EmployeeDemo> l1 = new ArrayList<EmployeeDemo>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);

		// System.out.println(l1);

//		for (int i=0;i<l1.size();i++){
//			System.out.println(l1.get(i));
//		}

		// access data using for-each Loop
//		for (EmployeeDemo i1 : l1) {
//			System.out.println(i1);
//		}
	
	
	}
}
