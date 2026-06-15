package spring.web.app.project.service;

import java.util.List;

import spring.web.app.project.entity.Employee;

public interface EmployeeService {
	public List<Employee> Fetchemployees();
	public Employee getData();
	public void DeleteData();
	public Employee UpdateData();
	public Employee SaveData();
}
