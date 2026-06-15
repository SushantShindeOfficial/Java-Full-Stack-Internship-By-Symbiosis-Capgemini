package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.UserRepository;
import project.finalproject.service.UserDeleteService;
@Service
public class UserDeleteServiceImple implements UserDeleteService{
	@Autowired
	private UserRepository userRepository;

	public UserDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

}
