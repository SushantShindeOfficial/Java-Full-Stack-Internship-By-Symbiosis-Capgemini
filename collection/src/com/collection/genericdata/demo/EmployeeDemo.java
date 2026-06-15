package com.collection.genericdata.demo;

public class EmployeeDemo {
	private int id;
	private String name;
	private String dob;
	private String add;

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
		return "EmployeeDemo [id=" + id + ", name=" + name + ", dob=" + dob + ", add=" + add + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

}
