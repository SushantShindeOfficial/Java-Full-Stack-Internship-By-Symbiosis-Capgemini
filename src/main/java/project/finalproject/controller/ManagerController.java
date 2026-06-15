package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Manager;
import project.finalproject.serviceimple.ManagerSaveServiceImple;
import project.finalproject.serviceimple.ManagerFetchServiceImple;
import project.finalproject.serviceimple.ManagerFetchAllServiceImple;
import project.finalproject.serviceimple.ManagerUpdateServiceImple;
import project.finalproject.serviceimple.ManagerDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/manager")
public class ManagerController {
	@Autowired
	private ManagerSaveServiceImple managerSaveServiceImple;

	@Autowired
	private ManagerUpdateServiceImple managerUpdateServiceImple;

	@Autowired
	private ManagerDeleteServiceImple managerDeleteServiceImple;

	@Autowired
	private ManagerFetchServiceImple managerFetchServiceImple;

	@Autowired
	private ManagerFetchAllServiceImple managerFetchAllServiceImple;

	@PostMapping("/saveManager")
	public ResponseEntity<Manager> saveManager(@RequestBody Manager manager) {
		Manager e1 = managerSaveServiceImple.saveManagerData(manager);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateManager/{id}")
	public ResponseEntity<Manager> updateManager(@RequestBody Manager manager, @PathVariable int id) {
		Manager e1 = managerUpdateServiceImple.updateManagerData(manager, id);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteManager/{id}")
	public ResponseEntity<String> deleteManager(@PathVariable int id) {
		managerDeleteServiceImple.deleteManagerData(id);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("Manager deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleManager/{id}")
	public ResponseEntity<Manager> singleManagerData(@PathVariable int id) {
		Manager e1 = managerFetchServiceImple.fetchManagerData(id);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllManagerData")
	public ResponseEntity<List<Manager>> allManagerData() {
		List<Manager> l1 = managerFetchAllServiceImple.fetchAllManagerData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}
