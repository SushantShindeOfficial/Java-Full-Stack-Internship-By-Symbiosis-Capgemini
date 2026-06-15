package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Product;
import project.finalproject.repository.ProductRepository;
import project.finalproject.service.ProductUpdateService;

@Service
public class ProductUpdateServiceImple implements ProductUpdateService{
	@Autowired
	private ProductRepository productRepository;

	public ProductUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Product updateProductData(Product product, int pid) {
		// TODO Auto-generated method stub
		Product o1=productRepository.findById(pid).get();
		o1.setName(product.getName());
		o1.setBrands(product.getBrands());
		o1.setPrice(product.getPrice());
		o1.setCategory(product.getCategory());
		o1.setProductReviews(product.getProductReviews());
		return productRepository.save(o1);
	}

}
