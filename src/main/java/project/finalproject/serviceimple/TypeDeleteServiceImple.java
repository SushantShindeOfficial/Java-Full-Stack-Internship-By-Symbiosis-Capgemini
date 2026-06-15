package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.TypeRepository;
import project.finalproject.service.TypeDeleteService;
@Service
public class TypeDeleteServiceImple implements TypeDeleteService{
	@Autowired
	private TypeRepository typeRepository;
	
	public TypeDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteTypeData(int tid) {
		// TODO Auto-generated method stub
		typeRepository.deleteById(tid);
	}

}
