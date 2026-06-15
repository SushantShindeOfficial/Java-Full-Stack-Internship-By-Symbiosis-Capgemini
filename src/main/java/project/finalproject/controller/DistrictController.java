package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.District;
import project.finalproject.serviceimple.DistrictSaveServiceImple;
import project.finalproject.serviceimple.DistrictFetchServiceImple;
import project.finalproject.serviceimple.DistrictFetchAllServiceImple;
import project.finalproject.serviceimple.DistrictUpdateServiceImple;
import project.finalproject.serviceimple.DistrictDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/district")
public class DistrictController {
	@Autowired
	private DistrictSaveServiceImple districtSaveServiceImple;

	@Autowired
	private DistrictUpdateServiceImple districtUpdateServiceImple;

	@Autowired
	private DistrictDeleteServiceImple districtDeleteServiceImple;

	@Autowired
	private DistrictFetchServiceImple districtFetchServiceImple;

	@Autowired
	private DistrictFetchAllServiceImple districtFetchAllServiceImple;

	@PostMapping("/saveDistrict")
	public ResponseEntity<District> saveDistrict(@RequestBody District district) {
		District e1 = districtSaveServiceImple.saveDistrictData(district);
		return new ResponseEntity<District>(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateDistrict/{id}")
	public ResponseEntity<District> updateDistrict(@RequestBody District district, @PathVariable int id) {
		District e1 = districtUpdateServiceImple.updateDistrictData(district, id);
		return new ResponseEntity<District>(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteDistrict/{id}")
	public ResponseEntity<String> deleteDistrict(@PathVariable int id) {
		districtDeleteServiceImple.deleteDistrictData(id);
		return new ResponseEntity<String>("District deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleDistrict/{id}")
	public ResponseEntity<District> singleDistrictData(@PathVariable int id) {
		District e1 = districtFetchServiceImple.fetchDistrictData(id);
		return new ResponseEntity<District>(e1, HttpStatus.OK);
	}

	@GetMapping("/AllDistrictData")
	public ResponseEntity<List<District>> allDistrictData() {
		List<District> l1 = districtFetchAllServiceImple.fetchAllDistrictData();
		return new ResponseEntity<List<District>>(l1, HttpStatus.OK);
	}
}
