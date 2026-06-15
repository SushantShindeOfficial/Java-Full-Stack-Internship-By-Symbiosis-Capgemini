package hp.java.hibernate.demo.entity;

import java.util.List;

public class Teacher {
	private int teacherId;
	private String name;
	private String city;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int teacherId, String name, String city, Float salary, List<Subject> subjects) {
		super();
		this.teacherId = teacherId;
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", name=" + name + ", city=" + city + ", salary=" + salary
				+ ", subjects=" + subjects + "]";
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
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

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	private Float salary;
	private List<Subject> subjects;
}
