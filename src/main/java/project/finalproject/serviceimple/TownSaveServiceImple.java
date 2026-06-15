package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Town;
import project.finalproject.repository.TownRepository;
import project.finalproject.service.TownSaveService;
@Service
public class TownSaveServiceImple implements TownSaveService{
	@Autowired
	private TownRepository townRepository;
	
	public TownSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Town saveTownData(Town town) {
		// TODO Auto-generated method stub
		return townRepository.save(town);
	}

}
