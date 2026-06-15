package springboot.spring.demo.framework.test;

public class Employee {
	private int id;
	private String nameString;
	private int salary;
	private String city;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String nameString, int salary, String city) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.salary = salary;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", nameString=" + nameString + ", salary=" + salary + ", city=" + city + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
