package spring.web.app.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.web.app.project.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer>{

}
