package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Manager;
import project.finalproject.repository.ManagerRepository;
import project.finalproject.service.ManagerFetchService;

@Service
public class ManagerFetchServiceImple implements ManagerFetchService{
	@Autowired
	private ManagerRepository managerRepository;

	public ManagerFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Manager fetchManagerData(int id) {
		// TODO Auto-generated method stub
		return managerRepository.findById(id).get();
	}

}
