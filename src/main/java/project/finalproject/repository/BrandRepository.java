package project.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.finalproject.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
