package com.collection.Linklist;

public class Employee {
	private int id;
	private String name;
	private String city;
	private String Salary;

	public Employee(int id, String name, String city, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		Salary = salary;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
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

}
