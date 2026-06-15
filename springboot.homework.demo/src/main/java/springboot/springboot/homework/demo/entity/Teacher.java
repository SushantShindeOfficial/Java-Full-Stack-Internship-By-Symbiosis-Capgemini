package springboot.springboot.homework.demo.entity;

import java.util.List;

public class Teacher {
	private int id;
	private String name;
	private String city;
	private float salary;

	private List<Subject> subjects;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String name, String city, float salary, List<Subject> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + ", subjects="
				+ subjects + "]";
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
}
