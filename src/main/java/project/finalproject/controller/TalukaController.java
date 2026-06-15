package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Taluka;
import project.finalproject.serviceimple.TalukaSaveServiceImple;
import project.finalproject.serviceimple.TalukaFetchServiceImple;
import project.finalproject.serviceimple.TalukaFetchAllServiceImple;
import project.finalproject.serviceimple.TalukaUpdateServiceImple;
import project.finalproject.serviceimple.TalukaDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/taluka")
public class TalukaController {
	@Autowired
	private TalukaSaveServiceImple talukaSaveServiceImple;

	@Autowired
	private TalukaUpdateServiceImple talukaUpdateServiceImple;

	@Autowired
	private TalukaDeleteServiceImple talukaDeleteServiceImple;

	@Autowired
	private TalukaFetchServiceImple talukaFetchServiceImple;

	@Autowired
	private TalukaFetchAllServiceImple talukaFetchAllServiceImple;

	@PostMapping("/saveTaluka")
	public ResponseEntity<Taluka> saveTaluka(@RequestBody Taluka taluka) {
		Taluka e1 = talukaSaveServiceImple.saveTalukaData(taluka);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateTaluka/{id}")
	public ResponseEntity<Taluka> updateTaluka(@RequestBody Taluka taluka, @PathVariable int id) {
		Taluka e1 = talukaUpdateServiceImple.updateTalukaData(taluka, id);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteTaluka/{id}")
	public ResponseEntity<String> deleteTaluka(@PathVariable int id) {
		talukaDeleteServiceImple.deleteTalukaData(id);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("Taluka deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleTaluka/{id}")
	public ResponseEntity<Taluka> singleTalukaData(@PathVariable int id) {
		Taluka e1 = talukaFetchServiceImple.fetchTalukaData(id);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllTalukaData")
	public ResponseEntity<List<Taluka>> allTalukaData() {
		List<Taluka> l1 = talukaFetchAllServiceImple.fetchAllTalukaData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}
