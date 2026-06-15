package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.PaymentMode;
import project.finalproject.repository.PaymentModeRepository;
import project.finalproject.service.PaymentModeFetchAllService;
@Service
public class PaymentModeFetchAllServiceImple implements PaymentModeFetchAllService{
	@Autowired
	private PaymentModeRepository paymentModeRepository;
	
	public PaymentModeFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<PaymentMode> fetchAllPaymentModeData() {
		// TODO Auto-generated method stub
		return paymentModeRepository.findAll();
	}

}
