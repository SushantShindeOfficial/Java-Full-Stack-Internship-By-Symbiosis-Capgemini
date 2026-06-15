package springboot.springboot.homework.demo2.entity;

import java.util.List;

public class Dept {
	private int id;
	private String name;
	private String building;

	private List<Employee> emps;

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(int id, String name, String building, List<Employee> emps) {
		super();
		this.id = id;
		this.name = name;
		this.building = building;
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", building=" + building + ", emps=" + emps + "]";
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

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
}
