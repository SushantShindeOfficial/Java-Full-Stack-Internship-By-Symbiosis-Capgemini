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
		Town newTown = project.finalproject.factory.TownFactory.createTown();
		org.springframework.beans.BeanUtils.copyProperties(town, newTown);
		return townRepository.save(newTown);
	}

}
