package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Manager;
import project.finalproject.repository.ManagerRepository;
import project.finalproject.service.ManagerSaveService;

@Service
public class ManagerSaveServiceImple implements ManagerSaveService{
	@Autowired
	private ManagerRepository managerRepository;

	public ManagerSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Manager saveManagerData(Manager manager) {
		// TODO Auto-generated method stub
		Manager newManager = project.finalproject.factory.ManagerFactory.createManager();
		org.springframework.beans.BeanUtils.copyProperties(manager, newManager);
		return managerRepository.save(newManager);
	}

}
