package spring.web.app.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.web.app.project.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	Student getByName(String name);
	Student getByCity(String city);

}
