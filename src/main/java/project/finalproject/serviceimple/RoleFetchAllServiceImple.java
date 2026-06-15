package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Role;
import project.finalproject.repository.RoleRepository;
import project.finalproject.service.RoleFetchAllService;

@Service
public class RoleFetchAllServiceImple implements RoleFetchAllService{
	@Autowired
	private RoleRepository roleRepository;

	public RoleFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Role> fetchAllRoleData() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

}
