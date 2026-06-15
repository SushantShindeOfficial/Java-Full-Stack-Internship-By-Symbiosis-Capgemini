package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Dept;
import project.finalproject.repository.DeptRepository;
import project.finalproject.service.DeptFetchAllService;

@Service
public class DeptFetchAllServiceImple implements DeptFetchAllService{
	@Autowired
	private DeptRepository deptRepository;

	public DeptFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Dept> fetchAllDeptData() {
		// TODO Auto-generated method stub
		return deptRepository.findAll();
	}

}
