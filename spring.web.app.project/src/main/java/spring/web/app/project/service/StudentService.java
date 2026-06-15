package spring.web.app.project.service;

import java.util.List;

import spring.web.app.project.entity.Employee;
import spring.web.app.project.entity.Student;

public interface StudentService {
	Student SaveStudent();

	Student getStudent();

	List<Student> getStudents();
	void DeleteData();

	Student UpdateData();
}
