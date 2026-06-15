package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.PaymentMode;
import project.finalproject.serviceimple.PaymentModeSaveServiceImple;
import project.finalproject.serviceimple.PaymentModeFetchServiceImple;
import project.finalproject.serviceimple.PaymentModeFetchAllServiceImple;
import project.finalproject.serviceimple.PaymentModeUpdateServiceImple;
import project.finalproject.serviceimple.PaymentModeDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/paymentMode")
public class PaymentModeController {
	@Autowired
	private PaymentModeSaveServiceImple paymentModeSaveServiceImple;

	@Autowired
	private PaymentModeUpdateServiceImple paymentModeUpdateServiceImple;

	@Autowired
	private PaymentModeDeleteServiceImple paymentModeDeleteServiceImple;

	@Autowired
	private PaymentModeFetchServiceImple paymentModeFetchServiceImple;

	@Autowired
	private PaymentModeFetchAllServiceImple paymentModeFetchAllServiceImple;

	@PostMapping("/savePaymentMode")
	public ResponseEntity<PaymentMode> savePaymentMode(@RequestBody PaymentMode paymentMode) {
		PaymentMode e1 = paymentModeSaveServiceImple.savePaymentModeData(paymentMode);
		return new ResponseEntity<PaymentMode>(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updatePaymentMode/{pmid}")
	public ResponseEntity<PaymentMode> updatePaymentMode(@RequestBody PaymentMode paymentMode, @PathVariable int pmid) {
		PaymentMode e1 = paymentModeUpdateServiceImple.updatePaymentModeData(paymentMode, pmid);
		return new ResponseEntity<PaymentMode>(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deletePaymentMode/{pmid}")
	public ResponseEntity<String> deletePaymentMode(@PathVariable int pmid) {
		paymentModeDeleteServiceImple.deletePaymentModeData(pmid);
		return new ResponseEntity<String>("PaymentMode deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SinglePaymentMode/{pmid}")
	public ResponseEntity<PaymentMode> singlePaymentModeData(@PathVariable int pmid) {
		PaymentMode e1 = paymentModeFetchServiceImple.fetchPaymentModeData(pmid);
		return new ResponseEntity<PaymentMode>(e1, HttpStatus.OK);
	}

	@GetMapping("/AllPaymentModeData")
	public ResponseEntity<List<PaymentMode>> allPaymentModeData() {
		List<PaymentMode> l1 = paymentModeFetchAllServiceImple.fetchAllPaymentModeData();
		return new ResponseEntity<List<PaymentMode>>(l1, HttpStatus.OK);
	}
}
