package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Admin;
import project.finalproject.repository.AdminRepository;
import project.finalproject.service.AdminFetchService;

@Service
public class AdminFetchServiceImple implements AdminFetchService{
	@Autowired
	private AdminRepository adminRepository;

	public AdminFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Admin fetchAdminData(int id) {
		// TODO Auto-generated method stub
		return adminRepository.findById(id).get();
	}

}
