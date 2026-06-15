package moto.cc2.java.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblEmployeee")
public class Employee {
	@Id
	@Column(name = "Employee_id")
	private int id;
	@Column(name = "Employee_Name")
	private String name;
	@Column(name = "Employee_Salary")
	private float salary;
	
	private String description;
	private String category;
}
