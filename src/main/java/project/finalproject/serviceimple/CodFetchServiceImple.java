package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Cod;
import project.finalproject.repository.CodRepository;
import project.finalproject.service.CodFetchService;
@Service
public class CodFetchServiceImple implements CodFetchService{
	@Autowired
	private CodRepository codRepository;
	
	public CodFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cod fetchCodData(int cid) {
		// TODO Auto-generated method stub
		return codRepository.findById(cid).get();
	}

}
