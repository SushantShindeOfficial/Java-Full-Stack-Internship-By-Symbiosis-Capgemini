package com.jvm.login;

public class Employee {
	static float pi=7.14f;
	private int id;
	private String name;
	private String pin;
	
	public Employee(int id, String name, String pin, String phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.pin = pin;
		this.phoneno = phoneno;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", pin=" + pin + ", phoneno=" + phoneno + "]";
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
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	private String phoneno;
}
