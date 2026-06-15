package com.collection.ojectcreation;

public class Data implements Cloneable {
	private int id;
	private String name;
	private String city;
	private int salary;

	public int getId() {
		return id;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Data(int id, String name, String city, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
