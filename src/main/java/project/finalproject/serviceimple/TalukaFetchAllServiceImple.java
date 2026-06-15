package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Taluka;
import project.finalproject.repository.TalukaRepository;
import project.finalproject.service.TalukaFetchAllService;
@Service
public class TalukaFetchAllServiceImple implements TalukaFetchAllService{
	@Autowired
	private TalukaRepository talukaRepository;
	
	public TalukaFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Taluka> fetchAllTalukaData() {
		// TODO Auto-generated method stub
		return talukaRepository.findAll();
	}

}
