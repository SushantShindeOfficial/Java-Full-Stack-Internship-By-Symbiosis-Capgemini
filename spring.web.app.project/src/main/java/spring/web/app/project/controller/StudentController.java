package spring.web.app.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.web.app.project.entity.Student;
import spring.web.app.project.serviceImple.StudentServiceImple;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	private StudentServiceImple studentServiceImple;

	public StudentController() {
		super();
	}

	public StudentController(StudentServiceImple studentServiceImple) {
		super();
		this.studentServiceImple = studentServiceImple;
	}

	@GetMapping("/data")
	public List<Student> getStudents() {

		return studentServiceImple.getStudents();

	}

	@GetMapping("/id")
	public Student getStudent() {

		return studentServiceImple.getStudent();

	}

	@GetMapping("/save")
	public Student saveStudent() {

		return studentServiceImple.SaveStudent();

	}

	@GetMapping("/deletedata")

	public void DeleteData() {
		studentServiceImple.DeleteData();
	}
	@GetMapping("/UpdateData")
	public Student UpdateData() {
		return studentServiceImple.UpdateData();
		
	} 

}