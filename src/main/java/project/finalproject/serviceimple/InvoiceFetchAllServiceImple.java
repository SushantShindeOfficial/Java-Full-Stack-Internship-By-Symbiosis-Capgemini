package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Invoice;
import project.finalproject.repository.InvoiceRepository;
import project.finalproject.service.InvoiceFetchAllService;
@Service
public class InvoiceFetchAllServiceImple implements InvoiceFetchAllService{
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	public InvoiceFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Invoice> fetchAllInvoiceData() {
		// TODO Auto-generated method stub
		return invoiceRepository.findAll();
	}

}
