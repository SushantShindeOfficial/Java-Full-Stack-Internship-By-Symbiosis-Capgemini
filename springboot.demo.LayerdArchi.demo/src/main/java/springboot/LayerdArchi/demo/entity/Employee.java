package springboot.LayerdArchi.demo.entity;

import java.io.Serializable;

public class Employee implements Serializable{
	private int EmpID;
	private String EmpName;
	private String EmpCity;
	private Address address;
	private Float Empsalary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empID, String empName, String empCity, Address address, Float empsalary) {
		super();
		EmpID = empID;
		EmpName = empName;
		EmpCity = empCity;
		this.address = address;
		Empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [EmpID=" + EmpID + ", EmpName=" + EmpName + ", EmpCity=" + EmpCity + ", address=" + address
				+ ", Empsalary=" + Empsalary + "]";
	}

	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpCity() {
		return EmpCity;
	}
	public void setEmpCity(String empCity) {
		EmpCity = empCity;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Float getEmpsalary() {
		return Empsalary;
	}
	public void setEmpsalary(Float empsalary) {
		Empsalary = empsalary;
	}
	
}	
