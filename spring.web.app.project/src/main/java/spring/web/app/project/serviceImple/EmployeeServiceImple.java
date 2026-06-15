package spring.web.app.project.serviceImple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.web.app.project.entity.Employee;
import spring.web.app.project.repository.EmployeeRepository;
import spring.web.app.project.service.EmployeeService;

@Service
public class EmployeeServiceImple implements EmployeeService {

	private final EmployeeRepository employeerepository;

	public EmployeeServiceImple(EmployeeRepository employeerepository) {

		this.employeerepository = employeerepository;
	}
	@Override
	public List<Employee> Fetchemployees() {

		return employeerepository.findAll();
	}
	@Override
	public Employee getData() {
		// TODO Auto-generated method stub
		int id=1;
		return employeerepository.findById(id).get();
	}
	@Override
	public void DeleteData() {
		// TODO Auto-generated method stub
		int id=1;
		 employeerepository.deleteById(id);
	}
	@Override
	public Employee UpdateData() {
		// TODO Auto-generated method stub
		int id=1;
		Employee e1=employeerepository.findById(id).get();
		e1.setId(1);
		e1.setName("Sushant");
		e1.setCity("Satara");
		e1.setSalary(86763);
		return employeerepository.save(e1);
	}
	@Override
	public Employee SaveData() {
		// TODO Auto-generated method stub
		int id =1;
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("Sushant");
		e1.setCity("Satara");
		e1.setSalary(86763);
		return employeerepository.save(e1);
	}
	

}