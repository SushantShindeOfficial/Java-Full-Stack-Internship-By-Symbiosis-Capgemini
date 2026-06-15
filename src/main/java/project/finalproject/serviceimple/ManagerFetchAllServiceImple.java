package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Manager;
import project.finalproject.repository.ManagerRepository;
import project.finalproject.service.ManagerFetchAllService;

@Service
public class ManagerFetchAllServiceImple implements ManagerFetchAllService{
	@Autowired
	private ManagerRepository managerRepository;

	public ManagerFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Manager> fetchAllManagerData() {
		// TODO Auto-generated method stub
		return managerRepository.findAll();
	}

}
