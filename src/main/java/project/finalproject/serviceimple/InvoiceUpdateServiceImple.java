package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Invoice;
import project.finalproject.repository.InvoiceRepository;
import project.finalproject.service.InvoiceUpdateService;

@Service
public class InvoiceUpdateServiceImple implements InvoiceUpdateService{
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	public InvoiceUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Invoice updateInvoiceData(Invoice invoice, int iid) {
		// TODO Auto-generated method stub
		Invoice i1 = invoiceRepository.findById(iid).get();
		i1.setProducts(invoice.getProducts());
		i1.setPaymentmode(invoice.getPaymentmode());
		i1.setShippingDetails(invoice.getShippingDetails());
		i1.setTracking(invoice.getTracking());
		
		return invoiceRepository.save(i1);
	}

}
