package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Admin;
import project.finalproject.repository.AdminRepository;
import project.finalproject.service.AdminFetchAllService;

@Service
public class AdminFetchAllServiceImple implements AdminFetchAllService{
	@Autowired
	private AdminRepository adminRepository;

	public AdminFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Admin> fetchAllAdminData() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

}
