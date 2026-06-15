package project.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.finalproject.entity.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer>{

}
