package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Invoice;
import project.finalproject.serviceimple.InvoiceSaveServiceImple;
import project.finalproject.serviceimple.InvoiceFetchServiceImple;
import project.finalproject.serviceimple.InvoiceFetchAllServiceImple;
import project.finalproject.serviceimple.InvoiceUpdateServiceImple;
import project.finalproject.serviceimple.InvoiceDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/invoice")
public class InvoiceController {
	@Autowired
	private InvoiceSaveServiceImple invoiceSaveServiceImple;

	@Autowired
	private InvoiceUpdateServiceImple invoiceUpdateServiceImple;

	@Autowired
	private InvoiceDeleteServiceImple invoiceDeleteServiceImple;

	@Autowired
	private InvoiceFetchServiceImple invoiceFetchServiceImple;

	@Autowired
	private InvoiceFetchAllServiceImple invoiceFetchAllServiceImple;

	@PostMapping("/saveInvoice")
	public ResponseEntity<Invoice> saveInvoice(@RequestBody Invoice invoice) {
		Invoice e1 = invoiceSaveServiceImple.saveInvoiceData(invoice);
		return new ResponseEntity<Invoice>(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateInvoice/{iid}")
	public ResponseEntity<Invoice> updateInvoice(@RequestBody Invoice invoice, @PathVariable int iid) {
		Invoice e1 = invoiceUpdateServiceImple.updateInvoiceData(invoice, iid);
		return new ResponseEntity<Invoice>(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteInvoice/{iid}")
	public ResponseEntity<String> deleteInvoice(@PathVariable int iid) {
		invoiceDeleteServiceImple.deleteInvoiceData(iid);
		return new ResponseEntity<String>("Invoice deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleInvoice/{iid}")
	public ResponseEntity<Invoice> singleInvoiceData(@PathVariable int iid) {
		Invoice e1 = invoiceFetchServiceImple.fetchInvoiceData(iid);
		return new ResponseEntity<Invoice>(e1, HttpStatus.OK);
	}

	@GetMapping("/AllInvoiceData")
	public ResponseEntity<List<Invoice>> allInvoiceData() {
		List<Invoice> l1 = invoiceFetchAllServiceImple.fetchAllInvoiceData();
		return new ResponseEntity<List<Invoice>>(l1, HttpStatus.OK);
	}
}
