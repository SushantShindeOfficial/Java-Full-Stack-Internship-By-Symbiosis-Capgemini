package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Invoice;
import project.finalproject.repository.InvoiceRepository;
import project.finalproject.service.InvoiceFetchService;
@Service
public class InvoiceFetchServiceImple implements InvoiceFetchService{
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	public InvoiceFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Invoice fetchInvoiceData(int iid) {
		// TODO Auto-generated method stub
		return invoiceRepository.findById(iid).get();
	}

}
