package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.ProductReviewRepository;
import project.finalproject.service.ProductReviewDeleteService;

@Service
public class ProductReviewDeleteServiceImple implements ProductReviewDeleteService{
	@Autowired
	private ProductReviewRepository productReviewRepository;

	public ProductReviewDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteProductReviewData(int prid) {
		// TODO Auto-generated method stub
		productReviewRepository.deleteById(prid);
	}

}
