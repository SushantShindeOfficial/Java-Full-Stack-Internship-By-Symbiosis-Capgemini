package spring.web.app.project.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import spring.web.app.project.entity.Employee;
import spring.web.app.project.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> saveData(@RequestBody Employee e) {

        Employee emp = employeeRepository.save(e);

        return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> fetchAll() {

        List<Employee> list = employeeRepository.findAll();

        return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Employee> fetchById(@PathVariable int id) {

        Employee emp = employeeRepository.findById(id).orElse(null);

        return new ResponseEntity<Employee>(emp, HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Employee> fetchByName(@PathVariable String name) {

        Employee emp = employeeRepository.findByName(name);

        return new ResponseEntity<Employee>(emp, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateData(@RequestBody Employee e) {

        Employee emp = employeeRepository.save(e);

        return new ResponseEntity<Employee>(emp, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteData(@PathVariable int id) {

        employeeRepository.deleteById(id);

        return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
    }
}