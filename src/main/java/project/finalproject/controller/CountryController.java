package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Country;
import project.finalproject.serviceimple.CountrySaveServiceImple;
import project.finalproject.serviceimple.CountryFetchServiceImple;
import project.finalproject.serviceimple.CountryFetchAllServiceImple;
import project.finalproject.serviceimple.CountryUpdateServiceImple;
import project.finalproject.serviceimple.CountryDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/country")
public class CountryController {
	@Autowired
	private CountrySaveServiceImple countrySaveServiceImple;

	@Autowired
	private CountryUpdateServiceImple countryUpdateServiceImple;

	@Autowired
	private CountryDeleteServiceImple countryDeleteServiceImple;

	@Autowired
	private CountryFetchServiceImple countryFetchServiceImple;

	@Autowired
	private CountryFetchAllServiceImple countryFetchAllServiceImple;

	@PostMapping("/saveCountry")
	public ResponseEntity<Country> saveCountry(@RequestBody Country country) {
		Country e1 = countrySaveServiceImple.saveCountryData(country);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateCountry/{id}")
	public ResponseEntity<Country> updateCountry(@RequestBody Country country, @PathVariable int id) {
		Country e1 = countryUpdateServiceImple.updateCountryData(country, id);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteCountry/{id}")
	public ResponseEntity<String> deleteCountry(@PathVariable int id) {
		countryDeleteServiceImple.deleteCountryData(id);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("Country deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleCountry/{id}")
	public ResponseEntity<Country> singleCountryData(@PathVariable int id) {
		Country e1 = countryFetchServiceImple.fetchCountryData(id);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllCountryData")
	public ResponseEntity<List<Country>> allCountryData() {
		List<Country> l1 = countryFetchAllServiceImple.fetchAllCountryData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}
