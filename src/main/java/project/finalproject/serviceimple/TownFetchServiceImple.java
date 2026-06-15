package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Town;
import project.finalproject.repository.TownRepository;
import project.finalproject.service.TownFetchService;
@Service
public class TownFetchServiceImple implements TownFetchService{
	@Autowired
	private TownRepository townRepository;
	
	public TownFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Town fetchTownData(int id) {
		// TODO Auto-generated method stub
		return townRepository.findById(id).get();
	}

}
