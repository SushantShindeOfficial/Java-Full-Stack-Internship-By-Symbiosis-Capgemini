package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.InvoiceRepository;
import project.finalproject.service.InvoiceDeleteService;
@Service
public class InvoiceDeleteServiceImple implements InvoiceDeleteService{
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	public InvoiceDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteInvoiceData(int iid) {
		// TODO Auto-generated method stub
		invoiceRepository.deleteById(iid);
	}

}
