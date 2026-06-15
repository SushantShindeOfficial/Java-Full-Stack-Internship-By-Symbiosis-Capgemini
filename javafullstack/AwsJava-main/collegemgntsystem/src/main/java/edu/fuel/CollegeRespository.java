package edu.fuel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CollegeRespository extends JpaRepository<College, Integer> {

}
