package edu.fuel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("home")
public class CollegeController {
	@Autowired
	CollegeRespository collegeRespository;
	@GetMapping
	public	List<College> fetch()
	{
		List<College> l1=collegeRespository.findAll();
		return l1;

	}
	@PostMapping
	public	College addCollege(@RequestBody College college)
	{
		College c1=collegeRespository.save(college);
		 return c1;

	}

}
