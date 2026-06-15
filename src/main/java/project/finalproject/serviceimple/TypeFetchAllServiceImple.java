package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Type;
import project.finalproject.repository.TypeRepository;
import project.finalproject.service.TypeFetchAllService;
@Service
public class TypeFetchAllServiceImple implements TypeFetchAllService{
	@Autowired
	private TypeRepository typeRepository;
	
	public TypeFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Type> fetchAllTypeData() {
		// TODO Auto-generated method stub
		return typeRepository.findAll();
	}

}
