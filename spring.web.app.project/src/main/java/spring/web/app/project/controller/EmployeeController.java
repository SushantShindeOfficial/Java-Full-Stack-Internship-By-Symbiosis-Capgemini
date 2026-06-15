package spring.web.app.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.web.app.project.entity.Employee;
import spring.web.app.project.serviceImple.EmployeeServiceImple;
@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	private EmployeeServiceImple employeeserviceimple;
	
	public EmployeeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeController(EmployeeServiceImple employeeserviceimple) {
		super();
		this.employeeserviceimple = employeeserviceimple;
	}
	
	@GetMapping("/data")
	public List<Employee> data(){
		
		
		return employeeserviceimple.Fetchemployees();
		
	}
	@GetMapping("/id")
	public Employee getData() {
		return employeeserviceimple.getData();
	}
	@DeleteMapping("/d1")
	public void DeleteData() {
		employeeserviceimple.DeleteData();
	}
	@GetMapping("/u1")
	public Employee UpdateData() {
		
		return employeeserviceimple.UpdateData();
		
	}
	@GetMapping("/s1")
	public Employee SaveData() {
		
		return employeeserviceimple.SaveData();
	}
}
