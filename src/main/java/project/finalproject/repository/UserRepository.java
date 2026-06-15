package project.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.finalproject.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
