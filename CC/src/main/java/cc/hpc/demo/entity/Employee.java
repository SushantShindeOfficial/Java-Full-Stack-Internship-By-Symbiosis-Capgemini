package cc.hpc.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblEmployee")//if table already existed
public class Employee {
	@Id
	@Column(name="id")
	private int eid;
	@Column(name="name")
	private String name;
	@Column(name="city")
	private String city;
	@Column(name="salary")
	private float salary;
	public int getId() {
		return eid;
	}
	public void setId(int id) {
		this.eid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + eid + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
//	public Employee(int id, String name, String city, float salary) {
//		super();
//		this.eid = id;
//		this.name = name;
//		this.city = city;
//		this.salary = salary;
//	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	 
}
