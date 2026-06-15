package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Admin;
import project.finalproject.repository.AdminRepository;
import project.finalproject.service.AdminUpdateService;

@Service
public class AdminUpdateServiceImple implements AdminUpdateService{
	@Autowired
	private AdminRepository adminRepository;

	public AdminUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Admin updateAdminData(Admin admin, int id) {
		// TODO Auto-generated method stub
		Admin a = adminRepository.findById(id).get();
		a.setName(admin.getName());
		a.setAdhar(admin.getAdhar());
		a.setPanno(admin.getPanno());
		a.setMailid(admin.getMailid());
		a.setDob(admin.getDob());
		a.setMobileNO(admin.getMobileNO());
		a.setDoj(admin.getDoj());
		a.setExperience(admin.getExperience());
		a.setAddress(admin.getAddress());
		a.setCompany(admin.getCompany());
		a.setDept(admin.getDept());
		a.setRole(admin.getRole());
		return adminRepository.save(a);
	}

}
