package project.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.finalproject.entity.CompanyResponse;

@Repository
public interface CompanyResponseRepository extends JpaRepository<CompanyResponse, Integer>{

}
