package springboot.springboot.demo3.entity;

import java.util.Date;

public class Employee {
	private int employeeId;
	private String fullName;
	private String aadharNumber;
	private String panNumber;
	private String email;
	private String mobileNumber;
	private String dateOfBirth;
	private String joiningDate;
	private String experience;
	private float salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
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
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", fullName=" + fullName + ", aadharNumber=" + aadharNumber
				+ ", panNumber=" + panNumber + ", email=" + email + ", mobileNumber=" + mobileNumber + ", dateOfBirth="
				+ dateOfBirth + ", joiningDate=" + joiningDate + ", experience=" + experience + ", salary=" + salary
				+ "]";
	}
	public Employee(int employeeId, String fullName, String aadharNumber, String panNumber, String email,
			String mobileNumber, String dateOfBirth, String joiningDate, String experience, float salary) {
		super();
		this.employeeId = employeeId;
		this.fullName = fullName;
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.dateOfBirth = dateOfBirth;
		this.joiningDate = joiningDate;
		this.experience = experience;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
