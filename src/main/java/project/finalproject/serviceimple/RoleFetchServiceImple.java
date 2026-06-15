package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Role;
import project.finalproject.repository.RoleRepository;
import project.finalproject.service.RoleFetchService;

@Service
public class RoleFetchServiceImple implements RoleFetchService{
	@Autowired
	private RoleRepository roleRepository;

	public RoleFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Role fetchRoleData(int id) {
		// TODO Auto-generated method stub
		return roleRepository.findById(id).get();
	}

}
