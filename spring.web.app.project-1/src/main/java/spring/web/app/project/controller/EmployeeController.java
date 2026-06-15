package spring.web.app.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.web.app.project.entity.Employee;
import spring.web.app.project.serviceImple.EmployeeServiceImple;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImple employeeServiceImple;

	public EmployeeController() {
		super();
	}

	public EmployeeController(EmployeeServiceImple employeeServiceImple) {
		super();
		this.employeeServiceImple = employeeServiceImple;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Employee>> allData() {
		List<Employee> l1 = employeeServiceImple.fetchData();
		return new ResponseEntity<List<Employee>>(l1, HttpStatus.OK);

	}

	@GetMapping("/single/{id}")
	public ResponseEntity<Employee> singleData(@PathVariable int id) {
		Employee e1 = employeeServiceImple.fetchData(id);
		return new ResponseEntity<Employee>(e1, HttpStatus.OK);

	}

	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Employee e1 = employeeServiceImple.saveData(employee);
		return new ResponseEntity<Employee>(e1, HttpStatus.CREATED);

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		Employee e1 = employeeServiceImple.updateData(employee, id);
		return new ResponseEntity<Employee>(e1, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
		employeeServiceImple.deleteData(id);
		return new ResponseEntity<String>("Employee Deleted Successfully", HttpStatus.OK);

	}

}