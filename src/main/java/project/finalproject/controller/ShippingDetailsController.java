package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.ShippingDetails;
import project.finalproject.serviceimple.ShippingDetailsSaveServiceImple;
import project.finalproject.serviceimple.ShippingDetailsFetchServiceImple;
import project.finalproject.serviceimple.ShippingDetailsFetchAllServiceImple;
import project.finalproject.serviceimple.ShippingDetailsUpdateServiceImple;
import project.finalproject.serviceimple.ShippingDetailsDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/shippingDetails")
public class ShippingDetailsController {
	@Autowired
	private ShippingDetailsSaveServiceImple shippingDetailsSaveServiceImple;

	@Autowired
	private ShippingDetailsUpdateServiceImple shippingDetailsUpdateServiceImple;

	@Autowired
	private ShippingDetailsDeleteServiceImple shippingDetailsDeleteServiceImple;

	@Autowired
	private ShippingDetailsFetchServiceImple shippingDetailsFetchServiceImple;

	@Autowired
	private ShippingDetailsFetchAllServiceImple shippingDetailsFetchAllServiceImple;

	@PostMapping("/saveShippingDetails")
	public ResponseEntity<ShippingDetails> saveShippingDetails(@RequestBody ShippingDetails shippingDetails) {
		ShippingDetails e1 = shippingDetailsSaveServiceImple.saveShippingDetailsData(shippingDetails);
		return new ResponseEntity<ShippingDetails>(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateShippingDetails/{sid}")
	public ResponseEntity<ShippingDetails> updateShippingDetails(@RequestBody ShippingDetails shippingDetails, @PathVariable int sid) {
		ShippingDetails e1 = shippingDetailsUpdateServiceImple.updateShippingDetailsData(shippingDetails, sid);
		return new ResponseEntity<ShippingDetails>(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteShippingDetails/{sid}")
	public ResponseEntity<String> deleteShippingDetails(@PathVariable int sid) {
		shippingDetailsDeleteServiceImple.deleteShippingDetailsData(sid);
		return new ResponseEntity<String>("ShippingDetails deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleShippingDetails/{sid}")
	public ResponseEntity<ShippingDetails> singleShippingDetailsData(@PathVariable int sid) {
		ShippingDetails e1 = shippingDetailsFetchServiceImple.fetchShippingDetailsData(sid);
		return new ResponseEntity<ShippingDetails>(e1, HttpStatus.OK);
	}

	@GetMapping("/AllShippingDetailsData")
	public ResponseEntity<List<ShippingDetails>> allShippingDetailsData() {
		List<ShippingDetails> l1 = shippingDetailsFetchAllServiceImple.fetchAllShippingDetailsData();
		return new ResponseEntity<List<ShippingDetails>>(l1, HttpStatus.OK);
	}
}
