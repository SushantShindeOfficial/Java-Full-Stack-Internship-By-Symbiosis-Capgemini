package com.collection.Linklist;

import java.util.LinkedList;

public class Test {
	public static void main(String[] args) {
		Employee e1=new Employee(101,"asdvf","sdfg","2345");
		Employee e2=new Employee(102,"jnk","egt","nut");
		Employee e3=new Employee(0, null, null, null);
		e3.setSalary("fgdfbgr");
		e3.setId(103);
		e3.setCity("Satara");
		e3.setName("JAva");
		
		LinkedList<Employee> employees=new LinkedList<Employee>();
		employees.add(e3);
		employees.addFirst(e2);
		employees.offerFirst(e1);
		employees.poll();
		employees.pollFirst();
		
		System.out.println(employees);
		
	}
}
