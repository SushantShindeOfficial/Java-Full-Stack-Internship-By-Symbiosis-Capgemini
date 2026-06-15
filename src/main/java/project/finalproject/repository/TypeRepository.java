package project.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.finalproject.entity.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Integer>{

}
