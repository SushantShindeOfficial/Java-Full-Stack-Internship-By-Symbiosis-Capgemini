package spring.web.app.project.serviceImple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.web.app.project.entity.Address;
import spring.web.app.project.entity.Employee;
import spring.web.app.project.entity.Student;
import spring.web.app.project.repository.StudentRepository;
import spring.web.app.project.service.StudentService;

@Service
public class StudentServiceImple implements StudentService {

	private final StudentRepository studentRepository;

	public StudentServiceImple(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudent() {
		int id = 1;
		return studentRepository.findById(id).get();
	}

	@Override
	public Student SaveStudent() {

		Address a1 = new Address();
		a1.setAddressid(1);
		a1.setArea("Shahu Nagar");
		a1.setFlatno(101);

		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Sushant");
		s1.setCity("Satara");
		s1.setAddress(a1);

		return studentRepository.save(s1);

	}

	@Override
	public void DeleteData() {
		// TODO Auto-generated method stub
		int id = 2;
		studentRepository.deleteById(id);

	}

	@Override
	public Student UpdateData() {
		// TODO Auto-generated method stub
		Address a1 = new Address();
		a1.setAddressid(1);
		a1.setArea("AnnaSaheb Kalyani Nagar");
		a1.setFlatno(101);

		int id = 1;
		Student e1 = studentRepository.findById(id).get();
		e1.setId(1);
		e1.setName("Sushant");
		e1.setCity("Satara");
		e1.setAddress(a1);
		return studentRepository.save(e1);
	}

}