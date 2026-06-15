package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Town;
import project.finalproject.serviceimple.TownSaveServiceImple;
import project.finalproject.serviceimple.TownFetchServiceImple;
import project.finalproject.serviceimple.TownFetchAllServiceImple;
import project.finalproject.serviceimple.TownUpdateServiceImple;
import project.finalproject.serviceimple.TownDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/town")
public class TownController {
	@Autowired
	private TownSaveServiceImple townSaveServiceImple;

	@Autowired
	private TownUpdateServiceImple townUpdateServiceImple;

	@Autowired
	private TownDeleteServiceImple townDeleteServiceImple;

	@Autowired
	private TownFetchServiceImple townFetchServiceImple;

	@Autowired
	private TownFetchAllServiceImple townFetchAllServiceImple;

	@PostMapping("/saveTown")
	public ResponseEntity<Town> saveTown(@RequestBody Town town) {
		Town e1 = townSaveServiceImple.saveTownData(town);
		return new ResponseEntity<Town>(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateTown/{id}")
	public ResponseEntity<Town> updateTown(@RequestBody Town town, @PathVariable int id) {
		Town e1 = townUpdateServiceImple.updateTownData(town, id);
		return new ResponseEntity<Town>(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteTown/{id}")
	public ResponseEntity<String> deleteTown(@PathVariable int id) {
		townDeleteServiceImple.deleteTownData(id);
		return new ResponseEntity<String>("Town deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleTown/{id}")
	public ResponseEntity<Town> singleTownData(@PathVariable int id) {
		Town e1 = townFetchServiceImple.fetchTownData(id);
		return new ResponseEntity<Town>(e1, HttpStatus.OK);
	}

	@GetMapping("/AllTownData")
	public ResponseEntity<List<Town>> allTownData() {
		List<Town> l1 = townFetchAllServiceImple.fetchAllTownData();
		return new ResponseEntity<List<Town>>(l1, HttpStatus.OK);
	}
}
