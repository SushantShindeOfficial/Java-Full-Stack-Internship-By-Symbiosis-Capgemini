package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.TownRepository;
import project.finalproject.service.TownDeleteService;
@Service
public class TownDeleteServiceImple implements TownDeleteService{
	@Autowired
	private TownRepository townRepository;
	
	public TownDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteTownData(int id) {
		// TODO Auto-generated method stub
		townRepository.deleteById(id);
	}

}
