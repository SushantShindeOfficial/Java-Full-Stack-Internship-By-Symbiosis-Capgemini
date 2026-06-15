package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Product;
import project.finalproject.repository.ProductRepository;
import project.finalproject.service.ProductSaveService;

@Service
public class ProductSaveServiceImple implements ProductSaveService{
	@Autowired
	private ProductRepository productRepository;

	public ProductSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Product saveProductData(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

}
