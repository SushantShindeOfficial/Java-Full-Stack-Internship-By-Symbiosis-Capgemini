package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Cod;
import project.finalproject.repository.CodRepository;
import project.finalproject.service.CodFetchAllService;
@Service
public class CodFetchAllServiceImple implements CodFetchAllService{
	@Autowired
	private CodRepository codRepository;
	
	public CodFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Cod> fetchAllCodData() {
		// TODO Auto-generated method stub
		return codRepository.findAll();
	}

}
