package project.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.finalproject.entity.CustomerQuery;

@Repository
public interface CustomerQueryRepository extends JpaRepository<CustomerQuery, Integer>{

}
