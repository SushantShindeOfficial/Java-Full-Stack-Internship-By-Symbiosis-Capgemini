package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Type;
import project.finalproject.repository.TypeRepository;
import project.finalproject.service.TypeSaveService;
@Service
public class TypeSaveServiceImple implements TypeSaveService{
	@Autowired
	private TypeRepository typeRepository;
	
	public TypeSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Type saveTypeData(Type type) {
		// TODO Auto-generated method stub
		return typeRepository.save(type);
	}

}
