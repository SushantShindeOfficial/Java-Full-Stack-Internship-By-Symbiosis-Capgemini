package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.ManagerRepository;
import project.finalproject.service.ManagerDeleteService;

@Service
public class ManagerDeleteServiceImple implements ManagerDeleteService{
	@Autowired
	private ManagerRepository managerRepository;

	public ManagerDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteManagerData(int id) {
		// TODO Auto-generated method stub
		managerRepository.deleteById(id);
	}

}
