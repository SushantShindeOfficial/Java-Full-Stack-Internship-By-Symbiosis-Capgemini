package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Dept;
import project.finalproject.repository.DeptRepository;
import project.finalproject.service.DeptFetchService;

@Service
public class DeptFetchServiceImple implements DeptFetchService{
	@Autowired
	private DeptRepository deptRepository;

	public DeptFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Dept fetchDeptData(int did) {
		// TODO Auto-generated method stub
		return deptRepository.findById(did).get();
	}

}
