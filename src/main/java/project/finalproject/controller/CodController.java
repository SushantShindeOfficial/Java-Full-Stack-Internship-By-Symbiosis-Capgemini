package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Cod;
import project.finalproject.serviceimple.CodSaveServiceImple;
import project.finalproject.serviceimple.CodFetchServiceImple;
import project.finalproject.serviceimple.CodFetchAllServiceImple;
import project.finalproject.serviceimple.CodUpdateServiceImple;
import project.finalproject.serviceimple.CodDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/cod")
public class CodController {
	@Autowired
	private CodSaveServiceImple codSaveServiceImple;

	@Autowired
	private CodUpdateServiceImple codUpdateServiceImple;

	@Autowired
	private CodDeleteServiceImple codDeleteServiceImple;

	@Autowired
	private CodFetchServiceImple codFetchServiceImple;

	@Autowired
	private CodFetchAllServiceImple codFetchAllServiceImple;

	@PostMapping("/saveCod")
	public ResponseEntity<Cod> saveCod(@RequestBody Cod cod) {
		Cod e1 = codSaveServiceImple.saveCodData(cod);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateCod/{cid}")
	public ResponseEntity<Cod> updateCod(@RequestBody Cod cod, @PathVariable int cid) {
		Cod e1 = codUpdateServiceImple.updateCodData(cod, cid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteCod/{cid}")
	public ResponseEntity<String> deleteCod(@PathVariable int cid) {
		codDeleteServiceImple.deleteCodData(cid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("Cod deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleCod/{cid}")
	public ResponseEntity<Cod> singleCodData(@PathVariable int cid) {
		Cod e1 = codFetchServiceImple.fetchCodData(cid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllCodData")
	public ResponseEntity<List<Cod>> allCodData() {
		List<Cod> l1 = codFetchAllServiceImple.fetchAllCodData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}
