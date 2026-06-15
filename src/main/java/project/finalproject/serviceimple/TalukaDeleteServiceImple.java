package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.TalukaRepository;
import project.finalproject.service.TalukaDeleteService;
@Service
public class TalukaDeleteServiceImple implements TalukaDeleteService{
	@Autowired
	private TalukaRepository talukaRepository;
	
	public TalukaDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteTalukaData(int id) {
		// TODO Auto-generated method stub
		talukaRepository.deleteById(id);
	}

}
