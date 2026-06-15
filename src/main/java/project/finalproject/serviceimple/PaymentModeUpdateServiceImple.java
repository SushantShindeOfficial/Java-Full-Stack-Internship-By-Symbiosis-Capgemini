package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.PaymentMode;
import project.finalproject.repository.PaymentModeRepository;
import project.finalproject.service.PaymentModeUpdateService;

@Service
public class PaymentModeUpdateServiceImple implements PaymentModeUpdateService{
	@Autowired
	private PaymentModeRepository paymentModeRepository;
	
	public PaymentModeUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public PaymentMode updatePaymentModeData(PaymentMode paymentMode, int pmid) {
		// TODO Auto-generated method stub
		PaymentMode p1 = paymentModeRepository.findById(pmid).get();
		p1.setCod(paymentMode.getCod());
		p1.setUpi(paymentMode.getUpi());
		p1.setCard(paymentMode.getCard());
		p1.setDateofpayment(paymentMode.getDateofpayment());
		p1.setStatus(paymentMode.isStatus());
		
		return paymentModeRepository.save(p1);
	}

}
