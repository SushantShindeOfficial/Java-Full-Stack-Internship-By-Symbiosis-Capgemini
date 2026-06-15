package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.EmployeeRepository;
import project.finalproject.service.EmployeeDeleteService;

@Service
public class EmployeeDeleteServiceImple implements EmployeeDeleteService{
	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteEmployeeData(int id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

}
