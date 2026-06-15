package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.ProductReview;
import project.finalproject.repository.ProductReviewRepository;
import project.finalproject.service.ProductReviewFetchAllService;

@Service
public class ProductReviewFetchAllServiceImple implements ProductReviewFetchAllService{
	@Autowired
	private ProductReviewRepository productReviewRepository;

	public ProductReviewFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ProductReview> fetchAllProductReviewData() {
		// TODO Auto-generated method stub
		return productReviewRepository.findAll();
	}

}
