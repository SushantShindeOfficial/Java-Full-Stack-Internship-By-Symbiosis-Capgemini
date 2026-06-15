package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import project.finalproject.entity.User;
import project.finalproject.serviceimple.UserDeleteServiceImple;
import project.finalproject.serviceimple.UserSaveServiceImple;
import project.finalproject.serviceimple.UserUpdateServiceImple;
import project.finalproject.serviceimple.UserfetchServiceImple;
import project.finalproject.serviceimple.UserfetchallServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
		@Autowired
		private UserSaveServiceImple userSaveServiceImple;

		@Autowired
		private UserUpdateServiceImple userupdateServiceImple;

		@Autowired
		private UserDeleteServiceImple userDeleteServiceImple;
		
		@Autowired
		private UserfetchServiceImple userfetchServiceImple;
		
		@Autowired
		private UserfetchallServiceImple userfetchallServiceImple;
		
		@PostMapping("/saveUser")
		public ResponseEntity<User> saveUser(@RequestBody User user)
		{	
			User u1 = userSaveServiceImple.saveUserData(user);
			return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(u1,HttpStatus.CREATED);
			
		}
		
		@PutMapping("/updateUser{id}")
		public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable int id)
		{	
			User  u1 = userupdateServiceImple.updateData(user, id);
			return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(u1,HttpStatus.CREATED);
			
		}
		
		@DeleteMapping("/deleteUser/{id}")
		public ResponseEntity<String> deleteUser(@PathVariable int id)
		{	
			userDeleteServiceImple.deleteData(id);
			return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("User deleted Successfully",HttpStatus.OK);
			
		}
		
		@GetMapping("/SingleUser/{id}")
		public ResponseEntity<User> singleUserData(@PathVariable int id)
		{	
			User u1 = userfetchServiceImple.fetchData(id);
			return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(u1,HttpStatus.OK);
			
		}
		
		@GetMapping("/AllUserData")
		public ResponseEntity<List<User>> allUserData()
		{
			List<User> l1=userfetchallServiceImple.fetchData();
			return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1,HttpStatus.OK); 
		}
}
