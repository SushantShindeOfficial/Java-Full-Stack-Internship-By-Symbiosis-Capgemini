package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.ProductReview;
import project.finalproject.repository.ProductReviewRepository;
import project.finalproject.service.ProductReviewFetchService;

@Service
public class ProductReviewFetchServiceImple implements ProductReviewFetchService{
	@Autowired
	private ProductReviewRepository productReviewRepository;

	public ProductReviewFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProductReview fetchProductReviewData(int prid) {
		// TODO Auto-generated method stub
		return productReviewRepository.findById(prid).get();
	}

}
