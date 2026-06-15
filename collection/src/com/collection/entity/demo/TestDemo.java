package com.collection.entity.demo;

import java.util.Vector;

public class TestDemo {
	public static void main(String[] args) {
		Employee e1=new Employee();
		Address a1=new Address();
		Org o1=new Org();
		
		e1.setName("java");
		e1.setAddress(a1);
		e1.setCity("Satara");
		e1.setId(1);
		
		a1.setArea("Godoli");
		a1.setCity("pune");
		a1.setLandmark("Old RTO");
		a1.setOrg(o1);
		a1.setPin("235678");
		
		o1.setOrgaddress(a1);
		o1.setOrgcity("Satara");
		o1.setOrgid("123");
		o1.setOrgname("JAVA");
		
		
		Vector<Employee> emp=new Vector<Employee>();
		Vector<Address> Add=new Vector<Address>();
		Vector<Org> org=new Vector<Org>();
		
		emp.add(e1);
		Add.add(a1);
		org.add(o1);
		
		System.out.println(emp);
		System.out.println(Add);
		System.out.println(org);
		
		
		
	}
}
