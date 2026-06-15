package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.User;
import project.finalproject.repository.UserRepository;
import project.finalproject.service.UserSaveService;

@Service
public class UserSaveServiceImple implements UserSaveService{
		@Autowired
		private UserRepository userRepository;

		public UserSaveServiceImple() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public User saveUserData(User user) {
			// TODO Auto-generated method stub
			User newUser = project.finalproject.factory.UserFactory.createUser();
		org.springframework.beans.BeanUtils.copyProperties(user, newUser);
		return userRepository.save(newUser);
		}

	}
		
		

