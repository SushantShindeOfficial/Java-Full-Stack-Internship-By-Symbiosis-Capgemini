package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Employee;
import project.finalproject.repository.EmployeeRepository;
import project.finalproject.service.EmployeeFetchService;

@Service
public class EmployeeFetchServiceImple implements EmployeeFetchService{
	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Employee fetchEmployeeData(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

}
