package moto.edge70fusion.entity;

public class Employee1 {
	private int id;
	private String name;
	private String dept;
	private Address city;
	private float salary;

	public Employee1(int id, String name, String dept, Address city, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.city = city;
		this.salary = salary;
	}

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", city=" + city + ", salary=" + salary
				+ "]";
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Address getCity() {
		return city;
	}

	public void setCity(Address city) {
		this.city = city;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}
