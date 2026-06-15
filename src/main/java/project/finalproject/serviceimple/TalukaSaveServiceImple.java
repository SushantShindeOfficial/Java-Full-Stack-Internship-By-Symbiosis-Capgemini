package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Taluka;
import project.finalproject.repository.TalukaRepository;
import project.finalproject.service.TalukaSaveService;
@Service
public class TalukaSaveServiceImple implements TalukaSaveService{
	@Autowired
	private TalukaRepository talukaRepository;
	
	public TalukaSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Taluka saveTalukaData(Taluka taluka) {
		// TODO Auto-generated method stub
		Taluka newTaluka = project.finalproject.factory.TalukaFactory.createTaluka();
		org.springframework.beans.BeanUtils.copyProperties(taluka, newTaluka);
		return talukaRepository.save(newTaluka);
	}

}
