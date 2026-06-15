package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.CompanyResponse;
import project.finalproject.serviceimple.CompanyResponseSaveServiceImple;
import project.finalproject.serviceimple.CompanyResponseFetchServiceImple;
import project.finalproject.serviceimple.CompanyResponseFetchAllServiceImple;
import project.finalproject.serviceimple.CompanyResponseUpdateServiceImple;
import project.finalproject.serviceimple.CompanyResponseDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/companyResponse")
public class CompanyResponseController {
	@Autowired
	private CompanyResponseSaveServiceImple companyResponseSaveServiceImple;

	@Autowired
	private CompanyResponseUpdateServiceImple companyResponseUpdateServiceImple;

	@Autowired
	private CompanyResponseDeleteServiceImple companyResponseDeleteServiceImple;

	@Autowired
	private CompanyResponseFetchServiceImple companyResponseFetchServiceImple;

	@Autowired
	private CompanyResponseFetchAllServiceImple companyResponseFetchAllServiceImple;

	@PostMapping("/saveCompanyResponse")
	public ResponseEntity<CompanyResponse> saveCompanyResponse(@RequestBody CompanyResponse companyResponse) {
		CompanyResponse e1 = companyResponseSaveServiceImple.saveCompanyResponseData(companyResponse);
		return new ResponseEntity<CompanyResponse>(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateCompanyResponse/{id}")
	public ResponseEntity<CompanyResponse> updateCompanyResponse(@RequestBody CompanyResponse companyResponse, @PathVariable int id) {
		CompanyResponse e1 = companyResponseUpdateServiceImple.updateCompanyResponseData(companyResponse, id);
		return new ResponseEntity<CompanyResponse>(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteCompanyResponse/{id}")
	public ResponseEntity<String> deleteCompanyResponse(@PathVariable int id) {
		companyResponseDeleteServiceImple.deleteCompanyResponseData(id);
		return new ResponseEntity<String>("CompanyResponse deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleCompanyResponse/{id}")
	public ResponseEntity<CompanyResponse> singleCompanyResponseData(@PathVariable int id) {
		CompanyResponse e1 = companyResponseFetchServiceImple.fetchCompanyResponseData(id);
		return new ResponseEntity<CompanyResponse>(e1, HttpStatus.OK);
	}

	@GetMapping("/AllCompanyResponseData")
	public ResponseEntity<List<CompanyResponse>> allCompanyResponseData() {
		List<CompanyResponse> l1 = companyResponseFetchAllServiceImple.fetchAllCompanyResponseData();
		return new ResponseEntity<List<CompanyResponse>>(l1, HttpStatus.OK);
	}
}
