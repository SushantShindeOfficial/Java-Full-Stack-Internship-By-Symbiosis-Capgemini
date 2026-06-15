package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.State;
import project.finalproject.repository.StateRepository;
import project.finalproject.service.StateUpdateService;

@Service
public class StateUpdateServiceImple implements StateUpdateService{
	@Autowired
	private StateRepository stateRepository;
	
	public StateUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public State updateStateData(State state, int id) {
		// TODO Auto-generated method stub
		State s1 = stateRepository.findById(id).get();
		s1.setName(state.getName());
		s1.setDistricts(state.getDistricts());
		
		return stateRepository.save(s1);
	}

}
