package com.mapping.demo;

import java.util.List;

public class Student {
	private int id;
    private String name;
    
    public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String city, List<Subject> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", subjects=" + subjects + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	private String city;

    private List<Subject> subjects;
}
