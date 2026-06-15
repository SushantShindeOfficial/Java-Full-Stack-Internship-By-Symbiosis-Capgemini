package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Employee;
import project.finalproject.repository.EmployeeRepository;
import project.finalproject.service.EmployeeFetchAllService;

@Service
public class EmployeeFetchAllServiceImple implements EmployeeFetchAllService{
	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Employee> fetchAllEmployeeData() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}
