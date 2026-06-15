package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.RoleRepository;
import project.finalproject.service.RoleDeleteService;

@Service
public class RoleDeleteServiceImple implements RoleDeleteService{
	@Autowired
	private RoleRepository roleRepository;

	public RoleDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteRoleData(int id) {
		// TODO Auto-generated method stub
		roleRepository.deleteById(id);
	}

}
