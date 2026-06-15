package springboot.springboot.homework.demo.entity;

public class Principal {
	private int id;
	private String name;
	private String city;
	private float salary;

	private College college;

	public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Principal(int id, String name, String city, float salary, College college) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.college = college;
	}

	@Override
	public String toString() {
		return "Principal [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + ", college="
				+ college + "]";
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

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
}
