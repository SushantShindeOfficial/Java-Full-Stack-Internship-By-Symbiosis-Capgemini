package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Role;
import project.finalproject.repository.RoleRepository;
import project.finalproject.service.RoleSaveService;

@Service
public class RoleSaveServiceImple implements RoleSaveService{
	@Autowired
	private RoleRepository roleRepository;

	public RoleSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Role saveRoleData(Role role) {
		// TODO Auto-generated method stub
		Role newRole = project.finalproject.factory.RoleFactory.createRole();
		org.springframework.beans.BeanUtils.copyProperties(role, newRole);
		return roleRepository.save(newRole);
	}

}
