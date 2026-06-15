package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.AdminRepository;
import project.finalproject.service.AdminDeleteService;

@Service
public class AdminDeleteServiceImple implements AdminDeleteService{
	@Autowired
	private AdminRepository adminRepository;

	public AdminDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteAdminData(int id) {
		// TODO Auto-generated method stub
		adminRepository.deleteById(id);
	}

}
