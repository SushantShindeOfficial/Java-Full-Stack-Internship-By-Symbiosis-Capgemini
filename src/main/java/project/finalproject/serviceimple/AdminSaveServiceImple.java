package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Admin;
import project.finalproject.repository.AdminRepository;
import project.finalproject.service.AdminSaveService;

@Service
public class AdminSaveServiceImple implements AdminSaveService{
	@Autowired
	private AdminRepository adminRepository;

	public AdminSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Admin saveAdminData(Admin admin) {
		// TODO Auto-generated method stub
		Admin newAdmin = project.finalproject.factory.AdminFactory.createAdmin();
		org.springframework.beans.BeanUtils.copyProperties(admin, newAdmin);
		return adminRepository.save(newAdmin);
	}

}
