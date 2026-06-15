package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.ProductReview;
import project.finalproject.repository.ProductReviewRepository;
import project.finalproject.service.ProductReviewUpdateService;

@Service
public class ProductReviewUpdateServiceImple implements ProductReviewUpdateService{
	@Autowired
	private ProductReviewRepository productReviewRepository;

	public ProductReviewUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProductReview updateProductReviewData(ProductReview productReview, int prid) {
		// TODO Auto-generated method stub
		ProductReview existingEntity = productReviewRepository.findById(prid).get();
		ProductReview o1 = project.finalproject.factory.ProductReviewFactory.createProductReview();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, o1);
		o1.setReview(productReview.getReview());
		o1.setProduct(productReview.getProduct());
		return productReviewRepository.save(o1);
	}

}
