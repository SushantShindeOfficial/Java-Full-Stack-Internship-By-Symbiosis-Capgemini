package project.finalproject.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Manager {
	@Id
	private int id;
	private String name;
	private String adhar;
	private String panno;
	private String mailid;
	private String experience;
	private float salary;
	private Date dob;
	private Date doj;
	private String mobileNo;
	@ManyToOne(targetEntity = Company.class)
	private Company company;
	@OneToOne
	private Dept dept;
	@OneToMany(targetEntity=Address.class)
	private List<Address> address;
	@OneToMany(targetEntity = Employee.class)
	private List<Employee> employees;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getAdhar() {
		return adhar;
	}
	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", adhar=" + adhar + ", panno=" + panno + ", mailid=" + mailid
				+ ", experience=" + experience + ", salary=" + salary + ", dob=" + dob + ", doj=" + doj + ", mobileNo="
				+ mobileNo + ", company=" + company + ", dept=" + dept + ", address=" + address + ", employees="
				+ employees + "]";
	}
	

}
