package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Taluka;
import project.finalproject.repository.TalukaRepository;
import project.finalproject.service.TalukaUpdateService;

@Service
public class TalukaUpdateServiceImple implements TalukaUpdateService{
	@Autowired
	private TalukaRepository talukaRepository;
	
	public TalukaUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Taluka updateTalukaData(Taluka taluka, int id) {
		// TODO Auto-generated method stub
		Taluka existingEntity = talukaRepository.findById(id).get();
		Taluka t1 = project.finalproject.factory.TalukaFactory.createTaluka();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, t1);
		t1.setName(taluka.getName());
		t1.setTowns(taluka.getTowns());
		
		return talukaRepository.save(t1);
	}

}
