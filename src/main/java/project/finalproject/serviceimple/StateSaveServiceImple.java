package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.State;
import project.finalproject.repository.StateRepository;
import project.finalproject.service.StateSaveService;
@Service
public class StateSaveServiceImple implements StateSaveService{
	@Autowired
	private StateRepository stateRepository;
	
	public StateSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public State saveStateData(State state) {
		// TODO Auto-generated method stub
		State newState = project.finalproject.factory.StateFactory.createState();
		org.springframework.beans.BeanUtils.copyProperties(state, newState);
		return stateRepository.save(newState);
	}

}
