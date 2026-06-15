package project.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.finalproject.entity.Cod;

@Repository
public interface CodRepository extends JpaRepository<Cod, Integer>{

}
