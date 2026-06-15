package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.PaymentModeRepository;
import project.finalproject.service.PaymentModeDeleteService;
@Service
public class PaymentModeDeleteServiceImple implements PaymentModeDeleteService{
	@Autowired
	private PaymentModeRepository paymentModeRepository;
	
	public PaymentModeDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deletePaymentModeData(int pmid) {
		// TODO Auto-generated method stub
		paymentModeRepository.deleteById(pmid);
	}

}
