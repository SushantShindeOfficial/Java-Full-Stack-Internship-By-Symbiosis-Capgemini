package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.PaymentMode;
import project.finalproject.repository.PaymentModeRepository;
import project.finalproject.service.PaymentModeSaveService;
@Service
public class PaymentModeSaveServiceImple implements PaymentModeSaveService{
	@Autowired
	private PaymentModeRepository paymentModeRepository;
	
	public PaymentModeSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public PaymentMode savePaymentModeData(PaymentMode paymentMode) {
		// TODO Auto-generated method stub
		return paymentModeRepository.save(paymentMode);
	}

}
