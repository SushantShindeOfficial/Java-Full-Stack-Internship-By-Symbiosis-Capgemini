package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Upi;
import project.finalproject.repository.UpiRepository;
import project.finalproject.service.UpiFetchAllService;

@Service
public class UpiFetchAllServiceImple implements UpiFetchAllService{
	@Autowired
	private UpiRepository upiRepository;
	
	public UpiFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Upi> fecthallUpiData() {
		// TODO Auto-generated method stub
		return upiRepository.findAll();
	}

}
