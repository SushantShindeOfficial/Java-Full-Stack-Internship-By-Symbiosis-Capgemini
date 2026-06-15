package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.UpiRepository;
import project.finalproject.service.UpiDeleteService;
@Service
public class UpiDeleteServiceImple implements UpiDeleteService{
	@Autowired
	private UpiRepository upiRepository;
	
	public UpiDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteupiData(int uid) {
		// TODO Auto-generated method stub
		upiRepository.deleteById(uid);
	}

}
