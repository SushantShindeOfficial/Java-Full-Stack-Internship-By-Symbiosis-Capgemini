package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Upi;
import project.finalproject.repository.UpiRepository;
import project.finalproject.service.UpiSaveService;
@Service
public class UpiSaveServiceImple implements UpiSaveService{
	@Autowired
	private UpiRepository upiRepository;
	
	public UpiSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Upi saveUpiData(Upi upi) {
		// TODO Auto-generated method stub
		return upiRepository.save(upi);
	}

}
