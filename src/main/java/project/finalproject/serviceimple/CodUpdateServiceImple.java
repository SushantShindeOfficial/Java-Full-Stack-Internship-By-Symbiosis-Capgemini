package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Cod;
import project.finalproject.repository.CodRepository;
import project.finalproject.service.CodUpdateService;

@Service
public class CodUpdateServiceImple implements CodUpdateService{
	@Autowired
	private CodRepository codRepository;
	
	public CodUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cod updateCodData(Cod cod, int cid) {
		// TODO Auto-generated method stub
		Cod existingEntity = codRepository.findById(cid).get();
		Cod c1 = project.finalproject.factory.CodFactory.createCod();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, c1);
		c1.setAmount(cod.getAmount());
		c1.setUser(cod.getUser());
		
		return codRepository.save(c1);
	}

}
