package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.StateRepository;
import project.finalproject.service.StateDeleteService;
@Service
public class StateDeleteServiceImple implements StateDeleteService{
	@Autowired
	private StateRepository stateRepository;
	
	public StateDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteStateData(int id) {
		// TODO Auto-generated method stub
		stateRepository.deleteById(id);
	}

}
