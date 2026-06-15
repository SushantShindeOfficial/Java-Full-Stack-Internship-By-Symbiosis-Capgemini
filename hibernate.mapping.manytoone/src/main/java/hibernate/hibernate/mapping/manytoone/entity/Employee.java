package hibernate.hibernate.mapping.manytoone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String city;
	private float salary;
	@ManyToOne
	private Dept dept;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
}
