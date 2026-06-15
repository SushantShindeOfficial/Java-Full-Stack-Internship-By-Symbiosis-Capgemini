package com.MapDSComposition.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Business {
	
	public void Data() {
		Student s1=new Student(101, "joey", "Mubai");
		Student s2=new Student(101, "Charli", "Hyd");
		Student s3=new Student(101, "Jeneliya", "UP");
		List<Student> l1=new ArrayList<Student>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		
		Student s4=new Student(101, "Mj", "UK");
		Student s5=new Student(101, "Martiny", "India");
		Student s6=new Student(101, "Karl", "Paris");
		List<Student> l2=new ArrayList<Student>();
		l2.add(s4);
		l2.add(s5);
		l2.add(s6);
		
		Student s7=new Student(101, "Night", "Netherlands");
		Student s8=new Student(101, "Harmayini", "Iceland");
		Student s9=new Student(101, "Stuyu", "Winterfell");
		List<Student> l3=new ArrayList<Student>();
		l3.add(s7);
		l3.add(s8);
		l3.add(s9);
		
		Student s10=new Student(101, "Senku", "7 Kingdoms");
		Student s11=new Student(101, "Sukasa", "Black tower");
		Student s12=new Student(101, "Hinlda", "Stunami island");
		List<Student> l4=new ArrayList<Student>();
		l4.add(s10);
		l4.add(s11);
		l4.add(s12);
		
		Dept d1=new Dept(201, "CS", l1);
		Dept d2=new Dept(202, "ENTC", l2);
		Dept d3=new Dept(203, "CIVIL", l3);
		Dept d4=new Dept(204, "MECH", l4);
		
		List<Dept> ld1=new ArrayList<Dept>();
		ld1.add(d1);
		ld1.add(d2);
		
		List<Dept> ld2=new ArrayList<Dept>();
		ld2.add(d3);
		ld2.add(d4);
		
		College c1=new College(301, "DY PAtil", ld1);
		College c2=new College(302, "Symboisis", ld2);
		
		Map<Integer, College> mmMap=new HashMap<Integer, College>();
		mmMap.put(1, c1);
		mmMap.put(2, c2);
		
//		System.out.println(mmMap);
		
		for(Map.Entry<Integer, College> m :mmMap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}
}
