package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Invoice;
import project.finalproject.repository.InvoiceRepository;
import project.finalproject.service.InvoiceSaveService;
@Service
public class InvoiceSaveServiceImple implements InvoiceSaveService{
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	public InvoiceSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Invoice saveInvoiceData(Invoice invoice) {
		// TODO Auto-generated method stub
		Invoice newInvoice = project.finalproject.factory.InvoiceFactory.createInvoice();
		org.springframework.beans.BeanUtils.copyProperties(invoice, newInvoice);
		return invoiceRepository.save(newInvoice);
	}

}
