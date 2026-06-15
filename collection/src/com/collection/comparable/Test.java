package com.collection.comparable;

import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student(201, "sdvfb", "asdvf", 10345);
		Student s2 = new Student(202, "dsfb", "mexdrfh", 3445);
		Student s3 = new Student(204, "kjhgfb", "sertyuytdxc", 673345);
		Student s4 = new Student(205, "siuytrb", "sdrtyhj", 10363456);
		Student s5 = new Student(203, "rfgbhju", "mjytgfvc", 98760345);

		TreeSet<Student> t1 = new TreeSet<>(new StudentBusiness());

		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		t1.add(s4);
		t1.add(s5);

		System.out.println(t1);
	}
}
