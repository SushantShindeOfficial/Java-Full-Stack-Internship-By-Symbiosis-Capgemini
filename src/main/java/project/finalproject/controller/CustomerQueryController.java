package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.CustomerQuery;
import project.finalproject.serviceimple.CustomerQuerySaveServiceImple;
import project.finalproject.serviceimple.CustomerQueryFetchServiceImple;
import project.finalproject.serviceimple.CustomerQueryFetchAllServiceImple;
import project.finalproject.serviceimple.CustomerQueryUpdateServiceImple;
import project.finalproject.serviceimple.CustomerQueryDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/customerQuery")
public class CustomerQueryController {
	@Autowired
	private CustomerQuerySaveServiceImple customerQuerySaveServiceImple;

	@Autowired
	private CustomerQueryUpdateServiceImple customerQueryUpdateServiceImple;

	@Autowired
	private CustomerQueryDeleteServiceImple customerQueryDeleteServiceImple;

	@Autowired
	private CustomerQueryFetchServiceImple customerQueryFetchServiceImple;

	@Autowired
	private CustomerQueryFetchAllServiceImple customerQueryFetchAllServiceImple;

	@PostMapping("/saveCustomerQuery")
	public ResponseEntity<CustomerQuery> saveCustomerQuery(@RequestBody CustomerQuery customerQuery) {
		CustomerQuery e1 = customerQuerySaveServiceImple.saveCustomerQueryData(customerQuery);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateCustomerQuery/{id}")
	public ResponseEntity<CustomerQuery> updateCustomerQuery(@RequestBody CustomerQuery customerQuery, @PathVariable int id) {
		CustomerQuery e1 = customerQueryUpdateServiceImple.updateCustomerQueryData(customerQuery, id);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteCustomerQuery/{id}")
	public ResponseEntity<String> deleteCustomerQuery(@PathVariable int id) {
		customerQueryDeleteServiceImple.deleteCustomerQueryData(id);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("CustomerQuery deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleCustomerQuery/{id}")
	public ResponseEntity<CustomerQuery> singleCustomerQueryData(@PathVariable int id) {
		CustomerQuery e1 = customerQueryFetchServiceImple.fetchCustomerQueryData(id);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllCustomerQueryData")
	public ResponseEntity<List<CustomerQuery>> allCustomerQueryData() {
		List<CustomerQuery> l1 = customerQueryFetchAllServiceImple.fetchAllCustomerQueryData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}
