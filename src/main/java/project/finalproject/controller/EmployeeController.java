package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Employee;
import project.finalproject.serviceimple.EmployeeSaveServiceImple;
import project.finalproject.serviceimple.EmployeeFetchServiceImple;
import project.finalproject.serviceimple.EmployeeFetchAllServiceImple;
import project.finalproject.serviceimple.EmployeeUpdateServiceImple;
import project.finalproject.serviceimple.EmployeeDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeSaveServiceImple employeeSaveServiceImple;

	@Autowired
	private EmployeeUpdateServiceImple employeeUpdateServiceImple;

	@Autowired
	private EmployeeDeleteServiceImple employeeDeleteServiceImple;

	@Autowired
	private EmployeeFetchServiceImple employeeFetchServiceImple;

	@Autowired
	private EmployeeFetchAllServiceImple employeeFetchAllServiceImple;

	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Employee e1 = employeeSaveServiceImple.saveEmployeeData(employee);
		return new ResponseEntity<Employee>(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateEmployee/{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		Employee e1 = employeeUpdateServiceImple.updateEmployeeData(employee, id);
		return new ResponseEntity<Employee>(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
		employeeDeleteServiceImple.deleteEmployeeData(id);
		return new ResponseEntity<String>("Employee deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleEmployee/{id}")
	public ResponseEntity<Employee> singleEmployeeData(@PathVariable int id) {
		Employee e1 = employeeFetchServiceImple.fetchEmployeeData(id);
		return new ResponseEntity<Employee>(e1, HttpStatus.OK);
	}

	@GetMapping("/AllEmployeeData")
	public ResponseEntity<List<Employee>> allEmployeeData() {
		List<Employee> l1 = employeeFetchAllServiceImple.fetchAllEmployeeData();
		return new ResponseEntity<List<Employee>>(l1, HttpStatus.OK);
	}
}
