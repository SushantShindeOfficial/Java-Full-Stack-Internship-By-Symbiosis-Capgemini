package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.State;
import project.finalproject.repository.StateRepository;
import project.finalproject.service.StateFetchAllService;
@Service
public class StateFetchAllServiceImple implements StateFetchAllService{
	@Autowired
	private StateRepository stateRepository;
	
	public StateFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<State> fetchAllStateData() {
		// TODO Auto-generated method stub
		return stateRepository.findAll();
	}

}
