package google.spring.entity;

import java.io.Serializable;
import java.util.List;

public class Dept implements Serializable{
	private int id;
	private String name;
	private List<Employee> employee;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int id, String name, List<Employee> employee) {
		super();
		this.id = id;
		this.name = name;
		this.employee = employee;
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
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", employee=" + employee + "]";
	}
	
}
