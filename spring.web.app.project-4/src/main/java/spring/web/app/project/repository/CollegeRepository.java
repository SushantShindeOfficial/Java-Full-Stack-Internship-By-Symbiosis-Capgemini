package spring.web.app.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.web.app.project.entity.College;

public interface CollegeRepository extends JpaRepository<College, Integer>{
	College getByName(String name);
	College getByCity(String city);



}
