package spring.web.app.project.service;

import java.util.List;

import spring.web.app.project.entity.Employee;

public interface EmployeeService {
	  List<Employee> fetchData();

	    Employee fetchData(int id);

	    Employee saveData(Employee employee);

	    Employee updateData(Employee employee, int id);

	    void deleteData(int id);
}
