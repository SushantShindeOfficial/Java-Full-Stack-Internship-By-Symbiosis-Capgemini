package com.collection.example;

import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Student s1=new Student(101, "vb", "dfgb", 234);
		Student s2=new Student(102, "sdfgb", "rgfgb", 434);
		Student s3=new Student(103, "fv", "rtggb", 2384);
		Student s4=new Student(104, "etyh", "rthfgb", 2734);
		Student s5=new Student(105, "hgtyhj", "dfher", 834);
		
		TreeSet<Student> t1=new TreeSet<Student>();
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		t1.add(s4);
		t1.add(s5);
		
		System.out.println(t1);
	}
}
