package spring.web.app.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.web.app.project.entity.Dept;

public interface DeptRepository extends JpaRepository<Dept, Integer>{

}
