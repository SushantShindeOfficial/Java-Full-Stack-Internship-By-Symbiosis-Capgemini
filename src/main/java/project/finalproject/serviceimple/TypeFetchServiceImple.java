package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Type;
import project.finalproject.repository.TypeRepository;
import project.finalproject.service.TypeFetchService;
@Service
public class TypeFetchServiceImple implements TypeFetchService{
	@Autowired
	private TypeRepository typeRepository;
	
	public TypeFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Type fetchTypeData(int tid) {
		// TODO Auto-generated method stub
		return typeRepository.findById(tid).get();
	}

}
