package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Role;
import project.finalproject.repository.RoleRepository;
import project.finalproject.service.RoleUpdateService;

@Service
public class RoleUpdateServiceImple implements RoleUpdateService{
	@Autowired
	private RoleRepository roleRepository;

	public RoleUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Role updateRoleData(Role role, int id) {
		// TODO Auto-generated method stub
		Role r = roleRepository.findById(id).get();
		r.setName(role.getName());
		return roleRepository.save(r);
	}

}
