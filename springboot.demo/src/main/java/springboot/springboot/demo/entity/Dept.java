package springboot.springboot.demo.entity;

import java.io.Serializable;
import java.util.List;

public class Dept implements Serializable{
	private int did;
	private String name;
	private List<Employee> employees;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", name=" + name + ", employees=" + employees + "]";
	}
	public Dept(int did, String name, List<Employee> employees) {
		super();
		this.did = did;
		this.name = name;
		this.employees = employees;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
