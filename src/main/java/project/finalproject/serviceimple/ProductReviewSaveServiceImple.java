package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.ProductReview;
import project.finalproject.repository.ProductReviewRepository;
import project.finalproject.service.ProductReviewSaveService;

@Service
public class ProductReviewSaveServiceImple implements ProductReviewSaveService{
	@Autowired
	private ProductReviewRepository productReviewRepository;

	public ProductReviewSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProductReview saveProductReviewData(ProductReview productReview) {
		// TODO Auto-generated method stub
		ProductReview newProductReview = project.finalproject.factory.ProductReviewFactory.createProductReview();
		org.springframework.beans.BeanUtils.copyProperties(productReview, newProductReview);
		return productReviewRepository.save(newProductReview);
	}

}
