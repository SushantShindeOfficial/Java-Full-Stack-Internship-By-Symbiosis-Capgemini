package project.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.finalproject.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
