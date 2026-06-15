package project.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.finalproject.entity.Taluka;

@Repository
public interface TalukaRepository extends JpaRepository<Taluka, Integer>{

}
