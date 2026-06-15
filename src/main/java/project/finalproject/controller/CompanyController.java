package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Company;
import project.finalproject.serviceimple.CompanySaveServiceImple;
import project.finalproject.serviceimple.CompanyFetchServiceImple;
import project.finalproject.serviceimple.CompanyFetchAllServiceImple;
import project.finalproject.serviceimple.CompanyUpdateServiceImple;
import project.finalproject.serviceimple.CompanyDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	private CompanySaveServiceImple companySaveServiceImple;

	@Autowired
	private CompanyUpdateServiceImple companyUpdateServiceImple;

	@Autowired
	private CompanyDeleteServiceImple companyDeleteServiceImple;

	@Autowired
	private CompanyFetchServiceImple companyFetchServiceImple;

	@Autowired
	private CompanyFetchAllServiceImple companyFetchAllServiceImple;

	@PostMapping("/saveCompany")
	public ResponseEntity<Company> saveCompany(@RequestBody Company company) {
		Company e1 = companySaveServiceImple.saveCompanyData(company);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateCompany/{regNo}")
	public ResponseEntity<Company> updateCompany(@RequestBody Company company, @PathVariable int regNo) {
		Company e1 = companyUpdateServiceImple.updateCompanyData(company, regNo);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteCompany/{regNo}")
	public ResponseEntity<String> deleteCompany(@PathVariable int regNo) {
		companyDeleteServiceImple.deleteCompanyData(regNo);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("Company deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleCompany/{regNo}")
	public ResponseEntity<Company> singleCompanyData(@PathVariable int regNo) {
		Company e1 = companyFetchServiceImple.fetchCompanyData(regNo);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllCompanyData")
	public ResponseEntity<List<Company>> allCompanyData() {
		List<Company> l1 = companyFetchAllServiceImple.fetchAllCompanyData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}
