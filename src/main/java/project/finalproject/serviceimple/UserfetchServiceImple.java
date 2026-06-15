package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.User;
import project.finalproject.repository.UserRepository;
import project.finalproject.service.UserfetchService;

@Service
public class UserfetchServiceImple implements UserfetchService{
	@Autowired
	private UserRepository userRepository;
	
	public UserfetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public User fetchData(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

}
