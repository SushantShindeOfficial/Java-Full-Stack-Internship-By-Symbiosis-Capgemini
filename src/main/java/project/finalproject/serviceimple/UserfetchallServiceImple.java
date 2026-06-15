package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.User;
import project.finalproject.repository.UserRepository;
import project.finalproject.service.UserfetchallService;
@Service
public class UserfetchallServiceImple implements UserfetchallService{
	@Autowired
	private UserRepository userRepository;
	
	public UserfetchallServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> fetchData() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
