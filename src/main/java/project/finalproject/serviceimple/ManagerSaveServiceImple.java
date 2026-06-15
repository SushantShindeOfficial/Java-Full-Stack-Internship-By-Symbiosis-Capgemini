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
		return managerRepository.save(manager);
	}

}
