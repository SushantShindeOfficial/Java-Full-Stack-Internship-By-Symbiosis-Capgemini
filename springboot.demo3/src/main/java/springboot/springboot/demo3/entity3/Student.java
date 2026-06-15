package springboot.springboot.demo3.entity3;

public class Student {
	private int id;
	private String Name;
	private String city;
	private String salary;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String city, String salary) {
		super();
		this.id = id;
		Name = name;
		this.city = city;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", city=" + city + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
}
