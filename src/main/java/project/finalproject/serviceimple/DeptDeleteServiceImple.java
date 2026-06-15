package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.DeptRepository;
import project.finalproject.service.DeptDeleteService;

@Service
public class DeptDeleteServiceImple implements DeptDeleteService{
	@Autowired
	private DeptRepository deptRepository;

	public DeptDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteDeptData(int did) {
		// TODO Auto-generated method stub
		deptRepository.deleteById(did);
	}

}
