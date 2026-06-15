package com.mapping.demo;

import java.util.List;

public class Teacher {
	private int id;
    public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String name, String salary, List<Subject> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + ", subjects=" + subjects + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String name;
    private String salary;

    private List<Subject> subjects;
}
