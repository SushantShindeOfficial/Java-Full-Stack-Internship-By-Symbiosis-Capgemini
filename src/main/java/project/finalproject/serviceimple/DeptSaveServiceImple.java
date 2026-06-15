package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Dept;
import project.finalproject.repository.DeptRepository;
import project.finalproject.service.DeptSaveService;

@Service
public class DeptSaveServiceImple implements DeptSaveService{
	@Autowired
	private DeptRepository deptRepository;

	public DeptSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Dept saveDeptData(Dept dept) {
		// TODO Auto-generated method stub
		Dept newDept = project.finalproject.factory.DeptFactory.createDept();
		org.springframework.beans.BeanUtils.copyProperties(dept, newDept);
		return deptRepository.save(newDept);
	}

}
