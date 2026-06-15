package project.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.finalproject.entity.ProductReview;

@Repository
public interface ProductReviewRepository extends JpaRepository<ProductReview, Integer>{

}
