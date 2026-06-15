package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Upi;
import project.finalproject.serviceimple.UpiSaveServiceImple;
import project.finalproject.serviceimple.UpiFetchServiceImple;
import project.finalproject.serviceimple.UpiFetchAllServiceImple;
import project.finalproject.serviceimple.UpiUpdateServiceImple;
import project.finalproject.serviceimple.UpiDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/upi")
public class UpiController {
	@Autowired
	private UpiSaveServiceImple upiSaveServiceImple;

	@Autowired
	private UpiUpdateServiceImple upiUpdateServiceImple;

	@Autowired
	private UpiDeleteServiceImple upiDeleteServiceImple;

	@Autowired
	private UpiFetchServiceImple upiFetchServiceImple;

	@Autowired
	private UpiFetchAllServiceImple upiFetchAllServiceImple;

	@PostMapping("/saveUpi")
	public ResponseEntity<Upi> saveUpi(@RequestBody Upi upi) {
		Upi e1 = upiSaveServiceImple.saveUpiData(upi);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateUpi/{uid}")
	public ResponseEntity<Upi> updateUpi(@RequestBody Upi upi, @PathVariable int uid) {
		Upi e1 = upiUpdateServiceImple.updateUpiData(upi, uid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteUpi/{uid}")
	public ResponseEntity<String> deleteUpi(@PathVariable int uid) {
		upiDeleteServiceImple.deleteupiData(uid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("Upi deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleUpi/{uid}")
	public ResponseEntity<Upi> singleUpiData(@PathVariable int uid) {
		Upi e1 = upiFetchServiceImple.fetchUpiData(uid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllUpiData")
	public ResponseEntity<List<Upi>> allUpiData() {
		List<Upi> l1 = upiFetchAllServiceImple.fecthallUpiData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}
