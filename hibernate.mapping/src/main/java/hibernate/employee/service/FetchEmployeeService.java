package hibernate.employee.service;

import java.util.List;

import hibernate.hibernate.mapping.entity.Company;

public interface FetchEmployeeService {
	List<Company> FetchData();
	
}
