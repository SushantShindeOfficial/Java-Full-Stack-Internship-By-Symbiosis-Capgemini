package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Type;
import project.finalproject.repository.TypeRepository;
import project.finalproject.service.TypeUpdateService;

@Service
public class TypeUpdateServiceImple implements TypeUpdateService{
	@Autowired
	private TypeRepository typeRepository;
	
	public TypeUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Type updateTypeData(Type type, int tid) {
		// TODO Auto-generated method stub
		Type t1 = typeRepository.findById(tid).get();
		t1.setName(type.getName());
		
		return typeRepository.save(t1);
	}

}
