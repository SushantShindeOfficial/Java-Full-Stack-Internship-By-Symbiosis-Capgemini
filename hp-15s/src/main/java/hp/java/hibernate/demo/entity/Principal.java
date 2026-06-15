package hp.java.hibernate.demo.entity;

public class Principal {
    private int principalId;
    private String name;
    public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Principal(int principalId, String name, String city, double salary, College college) {
		super();
		this.principalId = principalId;
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.college = college;
	}
	public int getPrincipalId() {
		return principalId;
	}
	public void setPrincipalId(int principalId) {
		this.principalId = principalId;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	private String city;
    private double salary;
    private College college;
}
