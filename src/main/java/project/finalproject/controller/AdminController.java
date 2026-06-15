package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Admin;
import project.finalproject.serviceimple.AdminSaveServiceImple;
import project.finalproject.serviceimple.AdminFetchServiceImple;
import project.finalproject.serviceimple.AdminFetchAllServiceImple;
import project.finalproject.serviceimple.AdminUpdateServiceImple;
import project.finalproject.serviceimple.AdminDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminSaveServiceImple adminSaveServiceImple;

	@Autowired
	private AdminUpdateServiceImple adminUpdateServiceImple;

	@Autowired
	private AdminDeleteServiceImple adminDeleteServiceImple;

	@Autowired
	private AdminFetchServiceImple adminFetchServiceImple;

	@Autowired
	private AdminFetchAllServiceImple adminFetchAllServiceImple;

	@PostMapping("/saveAdmin")
	public ResponseEntity<Admin> saveAdmin(@RequestBody Admin admin) {
		Admin e1 = adminSaveServiceImple.saveAdminData(admin);
		return new ResponseEntity<Admin>(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateAdmin/{id}")
	public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin, @PathVariable int id) {
		Admin e1 = adminUpdateServiceImple.updateAdminData(admin, id);
		return new ResponseEntity<Admin>(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteAdmin/{id}")
	public ResponseEntity<String> deleteAdmin(@PathVariable int id) {
		adminDeleteServiceImple.deleteAdminData(id);
		return new ResponseEntity<String>("Admin deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleAdmin/{id}")
	public ResponseEntity<Admin> singleAdminData(@PathVariable int id) {
		Admin e1 = adminFetchServiceImple.fetchAdminData(id);
		return new ResponseEntity<Admin>(e1, HttpStatus.OK);
	}

	@GetMapping("/AllAdminData")
	public ResponseEntity<List<Admin>> allAdminData() {
		List<Admin> l1 = adminFetchAllServiceImple.fetchAllAdminData();
		return new ResponseEntity<List<Admin>>(l1, HttpStatus.OK);
	}
}
