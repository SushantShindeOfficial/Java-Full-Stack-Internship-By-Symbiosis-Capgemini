package spring.web.app.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.web.app.project.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	Product findByName(String name);
//	Product findByName1(String address);
}
