package project.finalproject.factory;

import project.finalproject.entity.Employee;

public class EmployeeFactory {
	public static Employee createEmployee() {
		return new Employee();
	}
}
