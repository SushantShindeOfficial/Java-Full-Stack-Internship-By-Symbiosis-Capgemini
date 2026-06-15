package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Cod;
import project.finalproject.repository.CodRepository;
import project.finalproject.service.CodSaveService;
@Service
public class CodSaveServiceImple implements CodSaveService{
	@Autowired
	private CodRepository codRepository;
	
	public CodSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cod saveCodData(Cod cod) {
		// TODO Auto-generated method stub
		Cod newCod = project.finalproject.factory.CodFactory.createCod();
		org.springframework.beans.BeanUtils.copyProperties(cod, newCod);
		return codRepository.save(newCod);
	}

}
