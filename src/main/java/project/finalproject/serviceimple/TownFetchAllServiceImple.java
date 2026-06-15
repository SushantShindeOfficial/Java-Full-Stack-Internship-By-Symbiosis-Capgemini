package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Town;
import project.finalproject.repository.TownRepository;
import project.finalproject.service.TownFetchAllService;
@Service
public class TownFetchAllServiceImple implements TownFetchAllService{
	@Autowired
	private TownRepository townRepository;
	
	public TownFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Town> fetchAllTownData() {
		// TODO Auto-generated method stub
		return townRepository.findAll();
	}

}
