package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.CodRepository;
import project.finalproject.service.CodDeleteService;
@Service
public class CodDeleteServiceImple implements CodDeleteService{
	@Autowired
	private CodRepository codRepository;
	
	public CodDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteCodData(int cid) {
		// TODO Auto-generated method stub
		codRepository.deleteById(cid);
	}

}
