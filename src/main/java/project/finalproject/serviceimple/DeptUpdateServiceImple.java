package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Dept;
import project.finalproject.repository.DeptRepository;
import project.finalproject.service.DeptUpdateService;

@Service
public class DeptUpdateServiceImple implements DeptUpdateService{
	@Autowired
	private DeptRepository deptRepository;

	public DeptUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Dept updateDeptData(Dept dept, int did) {
		// TODO Auto-generated method stub
		Dept existingEntity = deptRepository.findById(did).get();
		Dept d = project.finalproject.factory.DeptFactory.createDept();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, d);
		d.setName(dept.getName());
		d.setManager(dept.getManager());
		d.setEmployees(dept.getEmployees());
		d.setAdmin(dept.getAdmin());
		return deptRepository.save(d);
	}

}
