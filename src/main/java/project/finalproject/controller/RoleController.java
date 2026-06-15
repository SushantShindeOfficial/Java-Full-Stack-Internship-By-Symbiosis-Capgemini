package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Role;
import project.finalproject.serviceimple.RoleSaveServiceImple;
import project.finalproject.serviceimple.RoleFetchServiceImple;
import project.finalproject.serviceimple.RoleFetchAllServiceImple;
import project.finalproject.serviceimple.RoleUpdateServiceImple;
import project.finalproject.serviceimple.RoleDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/role")
public class RoleController {
	@Autowired
	private RoleSaveServiceImple roleSaveServiceImple;

	@Autowired
	private RoleUpdateServiceImple roleUpdateServiceImple;

	@Autowired
	private RoleDeleteServiceImple roleDeleteServiceImple;

	@Autowired
	private RoleFetchServiceImple roleFetchServiceImple;

	@Autowired
	private RoleFetchAllServiceImple roleFetchAllServiceImple;

	@PostMapping("/saveRole")
	public ResponseEntity<Role> saveRole(@RequestBody Role role) {
		Role e1 = roleSaveServiceImple.saveRoleData(role);
		return new ResponseEntity<Role>(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateRole/{id}")
	public ResponseEntity<Role> updateRole(@RequestBody Role role, @PathVariable int id) {
		Role e1 = roleUpdateServiceImple.updateRoleData(role, id);
		return new ResponseEntity<Role>(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteRole/{id}")
	public ResponseEntity<String> deleteRole(@PathVariable int id) {
		roleDeleteServiceImple.deleteRoleData(id);
		return new ResponseEntity<String>("Role deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleRole/{id}")
	public ResponseEntity<Role> singleRoleData(@PathVariable int id) {
		Role e1 = roleFetchServiceImple.fetchRoleData(id);
		return new ResponseEntity<Role>(e1, HttpStatus.OK);
	}

	@GetMapping("/AllRoleData")
	public ResponseEntity<List<Role>> allRoleData() {
		List<Role> l1 = roleFetchAllServiceImple.fetchAllRoleData();
		return new ResponseEntity<List<Role>>(l1, HttpStatus.OK);
	}
}
