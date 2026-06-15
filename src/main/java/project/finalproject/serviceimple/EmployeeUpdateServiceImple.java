package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Employee;
import project.finalproject.repository.EmployeeRepository;
import project.finalproject.service.EmployeeUpdateService;

@Service
public class EmployeeUpdateServiceImple implements EmployeeUpdateService{
	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Employee updateEmployeeData(Employee employee, int id) {
		// TODO Auto-generated method stub
		Employee existingEntity = employeeRepository.findById(id).get();
		Employee e = project.finalproject.factory.EmployeeFactory.createEmployee();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, e);
		e.setName(employee.getName());
		e.setAdhar(employee.getAdhar());
		e.setPanno(employee.getPanno());
		e.setMailid(employee.getMailid());
		e.setDoj(employee.getDoj());
		e.setExperience(employee.getExperience());
		e.setDob(employee.getDob());
		e.setMobileNO(employee.getMobileNO());
		e.setAddress(employee.getAddress());
		e.setCompany(employee.getCompany());
		e.setManager(employee.getManager());
		e.setDept(employee.getDept());
		return employeeRepository.save(e);
	}

}
