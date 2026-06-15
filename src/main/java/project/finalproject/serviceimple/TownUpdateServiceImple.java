package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Town;
import project.finalproject.repository.TownRepository;
import project.finalproject.service.TownUpdateService;

@Service
public class TownUpdateServiceImple implements TownUpdateService{
	@Autowired
	private TownRepository townRepository;
	
	public TownUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Town updateTownData(Town town, int id) {
		// TODO Auto-generated method stub
		Town t1 = townRepository.findById(id).get();
		t1.setName(town.getName());
		
		return townRepository.save(t1);
	}

}
