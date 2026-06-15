package google.spring.entity;

import java.io.Serializable;

public class Employee implements Serializable{
	private int id;
	private String name;
	private Adhress adhress;
	private float salary;
	private String dept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, Adhress adhress, float salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.adhress = adhress;
		this.salary = salary;
		this.dept = dept;
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
	public Adhress getAdhress() {
		return adhress;
	}
	public void setAdhress(Adhress adhress) {
		this.adhress = adhress;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adhress=" + adhress + ", salary=" + salary + ", dept="
				+ dept + "]";
	}
	
	
	
	

}
