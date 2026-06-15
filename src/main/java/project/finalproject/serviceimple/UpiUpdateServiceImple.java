package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Upi;
import project.finalproject.repository.UpiRepository;
import project.finalproject.service.UpiUpdateService;

@Service
public class UpiUpdateServiceImple implements UpiUpdateService{
	@Autowired
	private UpiRepository upiRepository;
	
	public UpiUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Upi updateUpiData(Upi upi, int uid) {
		// TODO Auto-generated method stub
		Upi existingEntity = upiRepository.findById(uid).get();
		Upi u1 = project.finalproject.factory.UpiFactory.createUpi();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, u1);
		u1.setAmount(upi.getAmount());
		u1.setUser(upi.getUser());
		
		return upiRepository.save(u1);
	}

}
