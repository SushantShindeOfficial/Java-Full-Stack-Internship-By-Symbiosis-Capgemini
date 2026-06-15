package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Upi;
import project.finalproject.repository.UpiRepository;
import project.finalproject.service.UpiFetchService;
@Service
public class UpiFetchServiceImple implements UpiFetchService{
	@Autowired
	private UpiRepository upiRepository;
	
	public UpiFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Upi fetchUpiData(int uid) {
		// TODO Auto-generated method stub
		return upiRepository.findById(uid).get();
	}

}
