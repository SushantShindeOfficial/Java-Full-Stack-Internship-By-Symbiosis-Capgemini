package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Manager;
import project.finalproject.repository.ManagerRepository;
import project.finalproject.service.ManagerUpdateService;

@Service
public class ManagerUpdateServiceImple implements ManagerUpdateService{
	@Autowired
	private ManagerRepository managerRepository;

	public ManagerUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Manager updateManagerData(Manager manager, int id) {
		// TODO Auto-generated method stub
		Manager existingEntity = managerRepository.findById(id).get();
		Manager m = project.finalproject.factory.ManagerFactory.createManager();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, m);
		m.setName(manager.getName());
		m.setAdhar(manager.getAdhar());
		m.setPanno(manager.getPanno());
		m.setMailid(manager.getMailid());
		m.setExperience(manager.getExperience());
		m.setSalary(manager.getSalary());
		m.setDob(manager.getDob());
		m.setDoj(manager.getDoj());
		m.setMobileNo(manager.getMobileNo());
		m.setCompany(manager.getCompany());
		m.setDept(manager.getDept());
		m.setAddress(manager.getAddress());
		m.setEmployees(manager.getEmployees());
		return managerRepository.save(m);
	}

}
