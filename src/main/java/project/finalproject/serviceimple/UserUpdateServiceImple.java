package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.User;
import project.finalproject.repository.UserRepository;
import project.finalproject.service.UserUpdateService;
@Service
public class UserUpdateServiceImple implements UserUpdateService{
	@Autowired
	private UserRepository userRepository;
	
	public UserUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public User updateData(User user, int id) {
		// TODO Auto-generated method stub
		User u1 = userRepository.findById(id).get();
		u1.setName(user.getName());
		u1.setAdhar(user.getAdhar());
		u1.setPanno(user.getPanno());
		u1.setMailid(user.getMailid());
		u1.setDob(user.getDob());
		u1.setMobileno(user.getMobileno());
		u1.setAddresses(user.getAddresses());
		u1.setRole(user.getRole());
		return userRepository.save(u1);
	}
	
}
