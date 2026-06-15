package springboot.springboot.homework.demo2.entity;

import java.util.List;

public class Taluka {
	private int id;
	private String name;

	private List<String> towns;

	public Taluka() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Taluka(int id, String name, List<String> towns) {
		super();
		this.id = id;
		this.name = name;
		this.towns = towns;
	}

	@Override
	public String toString() {
		return "Taluka [id=" + id + ", name=" + name + ", towns=" + towns + "]";
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

	public List<String> getTowns() {
		return towns;
	}

	public void setTowns(List<String> towns) {
		this.towns = towns;
	}

}
