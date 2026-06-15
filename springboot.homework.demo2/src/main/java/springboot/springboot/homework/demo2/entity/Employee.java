package springboot.springboot.homework.demo2.entity;

public class Employee {
	private int id;
	private String name;

	private Address address;

	private float salary;
	private long mobId;
	private String adhar;
	private String pancard;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, Address address, float salary, long mobId, String adhar, String pancard) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.mobId = mobId;
		this.adhar = adhar;
		this.pancard = pancard;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + ", mobId="
				+ mobId + ", adhar=" + adhar + ", pancard=" + pancard + "]";
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public long getMobId() {
		return mobId;
	}
	public void setMobId(long mobId) {
		this.mobId = mobId;
	}
	public String getAdhar() {
		return adhar;
	}
	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
}
