package com.collection.entity.demo;

import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		Dept d1 = new Dept();
		Dept d2 = new Dept();
		Dept d3 = new Dept();

		s1.setName("sdf");
		s1.setDob("asdf");
		s1.setId(1);
		s1.setAdd("Satara");

		s2.setName("cxvd");
		s2.setDob("sdcfv");
		s2.setId(2);
		s2.setAdd("erfffw");

		s3.setName("af");
		s3.setDob("b");
		s3.setId(3);
		s3.setAdd("nf");
			
		d1.setDeptname("sdf");
		d1.setDeptarea("asdf");
		d1.setDeptid(1);
		s1.setAdd("Satara");

		d2.setDeptname("sdf");
		d2.setDeptarea("asdf");
		d2.setDeptid(1);
		s2.setAdd("Satara");

		d3.setDeptname("sdf");
		d3.setDeptarea("asdf");
		d3.setDeptid(1);
		s3.setAdd("Satara");
		
		Vector<Student> v1=new Vector<Student>();
		v1.add(s1);
		v1.add(s2);
		v1.add(s3);
		
		Vector<Dept> v2=new Vector<Dept>();
		v2.add(d1);
		v2.add(d2);
		v2.add(d3);
		
//		v1.clear();
		System.out.println(v1.getFirst());
		System.out.println(v1.getLast());
		System.out.println(v1.isEmpty());
		
		

	}
}
