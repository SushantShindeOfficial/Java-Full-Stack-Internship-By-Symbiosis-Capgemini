package spring.web.app.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.web.app.project.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
