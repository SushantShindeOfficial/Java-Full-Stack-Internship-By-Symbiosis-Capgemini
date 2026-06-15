package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Employee;
import project.finalproject.repository.EmployeeRepository;
import project.finalproject.service.EmployeeSaveService;

@Service
public class EmployeeSaveServiceImple implements EmployeeSaveService{
	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Employee saveEmployeeData(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

}
