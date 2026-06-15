package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Owner;
import project.finalproject.serviceimple.OwnerSaveServiceImple;
import project.finalproject.serviceimple.OwnerFetchServiceImple;
import project.finalproject.serviceimple.OwnerFetchAllServiceImple;
import project.finalproject.serviceimple.OwnerUpdateServiceImple;
import project.finalproject.serviceimple.OwnerDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/owner")
public class OwnerController {
	@Autowired
	private OwnerSaveServiceImple ownerSaveServiceImple;

	@Autowired
	private OwnerUpdateServiceImple ownerUpdateServiceImple;

	@Autowired
	private OwnerDeleteServiceImple ownerDeleteServiceImple;

	@Autowired
	private OwnerFetchServiceImple ownerFetchServiceImple;

	@Autowired
	private OwnerFetchAllServiceImple ownerFetchAllServiceImple;

	@PostMapping("/saveOwner")
	public ResponseEntity<Owner> saveOwner(@RequestBody Owner owner) {
		Owner e1 = ownerSaveServiceImple.saveOwnerData(owner);
		return new ResponseEntity<Owner>(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateOwner/{id}")
	public ResponseEntity<Owner> updateOwner(@RequestBody Owner owner, @PathVariable int id) {
		Owner e1 = ownerUpdateServiceImple.updateOwnerData(owner, id);
		return new ResponseEntity<Owner>(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteOwner/{id}")
	public ResponseEntity<String> deleteOwner(@PathVariable int id) {
		ownerDeleteServiceImple.deleteOwnerData(id);
		return new ResponseEntity<String>("Owner deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleOwner/{id}")
	public ResponseEntity<Owner> singleOwnerData(@PathVariable int id) {
		Owner e1 = ownerFetchServiceImple.fetchOwnerData(id);
		return new ResponseEntity<Owner>(e1, HttpStatus.OK);
	}

	@GetMapping("/AllOwnerData")
	public ResponseEntity<List<Owner>> allOwnerData() {
		List<Owner> l1 = ownerFetchAllServiceImple.fetchAllOwnerData();
		return new ResponseEntity<List<Owner>>(l1, HttpStatus.OK);
	}
}
