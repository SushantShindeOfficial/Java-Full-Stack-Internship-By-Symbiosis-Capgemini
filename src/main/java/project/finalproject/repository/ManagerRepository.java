package project.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.finalproject.entity.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer>{

}
