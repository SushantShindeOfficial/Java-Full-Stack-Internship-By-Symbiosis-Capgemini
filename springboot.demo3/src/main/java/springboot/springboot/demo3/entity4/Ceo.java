package springboot.springboot.demo3.entity4;

public class Ceo {
	private int id;
	private String name;
	private String salary;
	private Address address;
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Ceo [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	public Ceo(int id, String name, String salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public Ceo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
