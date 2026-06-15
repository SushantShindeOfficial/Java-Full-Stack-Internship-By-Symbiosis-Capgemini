package project.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.finalproject.entity.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer>{

}
