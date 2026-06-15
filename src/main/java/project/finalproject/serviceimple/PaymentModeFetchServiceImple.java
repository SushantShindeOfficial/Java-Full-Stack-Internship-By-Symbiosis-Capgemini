package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.PaymentMode;
import project.finalproject.repository.PaymentModeRepository;
import project.finalproject.service.PaymentModeFetchService;
@Service
public class PaymentModeFetchServiceImple implements PaymentModeFetchService{
	@Autowired
	private PaymentModeRepository paymentModeRepository;
	
	public PaymentModeFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public PaymentMode fetchPaymentModeData(int pmid) {
		// TODO Auto-generated method stub
		return paymentModeRepository.findById(pmid).get();
	}

}
