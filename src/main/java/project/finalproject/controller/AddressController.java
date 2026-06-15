package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Address;
import project.finalproject.serviceimple.AddressSaveServiceImple;
import project.finalproject.serviceimple.AddressFetchServiceImple;
import project.finalproject.serviceimple.AddressFetchAllServiceImple;
import project.finalproject.serviceimple.AddressUpdateServiceImple;
import project.finalproject.serviceimple.AddressDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	private AddressSaveServiceImple addressSaveServiceImple;

	@Autowired
	private AddressUpdateServiceImple addressUpdateServiceImple;

	@Autowired
	private AddressDeleteServiceImple addressDeleteServiceImple;

	@Autowired
	private AddressFetchServiceImple addressFetchServiceImple;

	@Autowired
	private AddressFetchAllServiceImple addressFetchAllServiceImple;

	@PostMapping("/saveAddress")
	public ResponseEntity<Address> saveAddress(@RequestBody Address address) {
		Address e1 = addressSaveServiceImple.saveAddressData(address);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateAddress/{flatno}")
	public ResponseEntity<Address> updateAddress(@RequestBody Address address, @PathVariable int flatno) {
		Address e1 = addressUpdateServiceImple.updateAddressData(address, flatno);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteAddress/{flatno}")
	public ResponseEntity<String> deleteAddress(@PathVariable int flatno) {
		addressDeleteServiceImple.deleteAddressData(flatno);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("Address deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleAddress/{flatno}")
	public ResponseEntity<Address> singleAddressData(@PathVariable int flatno) {
		Address e1 = addressFetchServiceImple.fetchAddressData(flatno);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllAddressData")
	public ResponseEntity<List<Address>> allAddressData() {
		List<Address> l1 = addressFetchAllServiceImple.fetchAllAddressData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}
