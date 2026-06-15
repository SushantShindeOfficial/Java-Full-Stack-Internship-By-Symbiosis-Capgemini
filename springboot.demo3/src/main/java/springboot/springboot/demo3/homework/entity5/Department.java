package springboot.springboot.demo3.homework.entity5;

import java.util.List;

public class Department {
	private int DepartmentID;
	private String DepartmentName;
	private Manager manager;
	private List<Employee> employees;
	private List<Admin> admins;
}
