package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Taluka;
import project.finalproject.repository.TalukaRepository;
import project.finalproject.service.TalukaFetchService;
@Service
public class TalukaFetchServiceImple implements TalukaFetchService{
	@Autowired
	private TalukaRepository talukaRepository;
	
	public TalukaFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Taluka fetchTalukaData(int id) {
		// TODO Auto-generated method stub
		return talukaRepository.findById(id).get();
	}

}
