package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Dept;
import project.finalproject.serviceimple.DeptSaveServiceImple;
import project.finalproject.serviceimple.DeptFetchServiceImple;
import project.finalproject.serviceimple.DeptFetchAllServiceImple;
import project.finalproject.serviceimple.DeptUpdateServiceImple;
import project.finalproject.serviceimple.DeptDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	private DeptSaveServiceImple deptSaveServiceImple;

	@Autowired
	private DeptUpdateServiceImple deptUpdateServiceImple;

	@Autowired
	private DeptDeleteServiceImple deptDeleteServiceImple;

	@Autowired
	private DeptFetchServiceImple deptFetchServiceImple;

	@Autowired
	private DeptFetchAllServiceImple deptFetchAllServiceImple;

	@PostMapping("/saveDept")
	public ResponseEntity<Dept> saveDept(@RequestBody Dept dept) {
		Dept e1 = deptSaveServiceImple.saveDeptData(dept);
		return new ResponseEntity<Dept>(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateDept/{did}")
	public ResponseEntity<Dept> updateDept(@RequestBody Dept dept, @PathVariable int did) {
		Dept e1 = deptUpdateServiceImple.updateDeptData(dept, did);
		return new ResponseEntity<Dept>(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteDept/{did}")
	public ResponseEntity<String> deleteDept(@PathVariable int did) {
		deptDeleteServiceImple.deleteDeptData(did);
		return new ResponseEntity<String>("Dept deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleDept/{did}")
	public ResponseEntity<Dept> singleDeptData(@PathVariable int did) {
		Dept e1 = deptFetchServiceImple.fetchDeptData(did);
		return new ResponseEntity<Dept>(e1, HttpStatus.OK);
	}

	@GetMapping("/AllDeptData")
	public ResponseEntity<List<Dept>> allDeptData() {
		List<Dept> l1 = deptFetchAllServiceImple.fetchAllDeptData();
		return new ResponseEntity<List<Dept>>(l1, HttpStatus.OK);
	}
}
