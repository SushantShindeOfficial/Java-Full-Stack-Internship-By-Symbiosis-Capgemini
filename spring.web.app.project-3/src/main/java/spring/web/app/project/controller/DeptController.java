package spring.web.app.project.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import spring.web.app.project.entity.Dept;
import spring.web.app.project.repository.DeptRepository;

@RestController
@RequestMapping("/dept")
public class DeptController {

	private DeptRepository deptRepository;

	public DeptController(DeptRepository deptRepository) {
		this.deptRepository = deptRepository;
	}

	@PostMapping("/save")
	public ResponseEntity<Dept> saveData(@RequestBody Dept d) {

		Dept dept = deptRepository.save(d);

		return new ResponseEntity<Dept>(dept, HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Dept>> fetchAll() {

		List<Dept> list = deptRepository.findAll();

		return new ResponseEntity<List<Dept>>(list, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Dept> fetchById(@PathVariable int id) {

		Dept dept = deptRepository.findById(id).orElse(null);

		return new ResponseEntity<Dept>(dept, HttpStatus.OK);
	}

	@GetMapping("/name/{name}")
	public ResponseEntity<Dept> fetchByName(@PathVariable String name) {

		Dept dept = deptRepository.findByName(name);

		return new ResponseEntity<Dept>(dept, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Dept> updateData(@RequestBody Dept d) {

		Dept dept = deptRepository.save(d);

		return new ResponseEntity<Dept>(dept, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteData(@PathVariable int id) {

		deptRepository.deleteById(id);

		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
	}
}