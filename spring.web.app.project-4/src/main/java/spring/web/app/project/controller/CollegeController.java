package spring.web.app.project.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.web.app.project.entity.College;
import spring.web.app.project.repository.CollegeRepository;

@RestController
@RequestMapping("/college")
public class CollegeController {
	private CollegeRepository collegeRepository;

	public CollegeController(CollegeRepository collegeRepository) {
		super();
		this.collegeRepository = collegeRepository;
	}

	@GetMapping("/name/{name}")
	public ResponseEntity<College> getCollegeByName(@PathVariable String name) {
		College college = collegeRepository.getByName(name);
		return ResponseEntity.ok(college);
	}

	@GetMapping("/city/{city}")
	public ResponseEntity<College> getCollegeByCity(@PathVariable String city) {
		College college = collegeRepository.getByCity(city);
		return ResponseEntity.ok(college);
	}

	@GetMapping
	public ResponseEntity<List<College>> getAllColleges() {

		List<College> colleges = collegeRepository.findAll();

		return ResponseEntity.ok(colleges);
	}
}
