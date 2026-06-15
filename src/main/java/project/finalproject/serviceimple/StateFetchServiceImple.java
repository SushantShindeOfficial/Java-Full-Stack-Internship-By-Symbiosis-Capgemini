package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.State;
import project.finalproject.repository.StateRepository;
import project.finalproject.service.StateFetchService;
@Service
public class StateFetchServiceImple implements StateFetchService{
	@Autowired
	private StateRepository stateRepository;
	
	public StateFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public State fetchStateData(int id) {
		// TODO Auto-generated method stub
		return stateRepository.findById(id).get();
	}

}
