package com.collection.comparable;

import java.util.Comparator;

public class StudentBusiness  implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(), o2.getId());
	}
	
}
