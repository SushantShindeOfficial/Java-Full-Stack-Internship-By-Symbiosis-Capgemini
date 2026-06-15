package com.javaentityclass.demo;
//@Entity =
public class EntityClassDemo {
	//@id
	private int id;
	private String name;
	private String city;
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
	public EntityClassDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EntityClassDemo(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
}
