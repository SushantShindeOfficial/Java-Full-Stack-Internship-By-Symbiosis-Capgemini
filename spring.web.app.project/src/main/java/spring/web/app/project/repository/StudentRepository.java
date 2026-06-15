package spring.web.app.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.web.app.project.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
