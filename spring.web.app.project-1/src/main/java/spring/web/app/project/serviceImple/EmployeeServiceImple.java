package spring.web.app.project.serviceImple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.web.app.project.entity.Employee;
import spring.web.app.project.repository.EmployeeRepository;
import spring.web.app.project.service.EmployeeService;

@Service
public class EmployeeServiceImple implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	public EmployeeServiceImple(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;

	}

	@Override
	public List<Employee> fetchData() {
		return employeeRepository.findAll();

	}

	@Override
	public Employee fetchData(int id) {
		return employeeRepository.findById(id).get();

	}

	@Override
	public Employee saveData(Employee employee) {
		return employeeRepository.save(employee);

	}

	@Override
	public Employee updateData(Employee employee, int id) {

		Employee e1 = employeeRepository.findById(id).get();

		e1.setName(employee.getName());
		e1.setCity(employee.getCity());
		e1.setSalary(employee.getSalary());
		e1.setDepts(employee.getDepts());

		return employeeRepository.save(e1);

	}

	@Override
	public void deleteData(int id) {
		employeeRepository.deleteById(id);

	}

}