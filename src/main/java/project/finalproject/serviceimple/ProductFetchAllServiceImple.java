package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Product;
import project.finalproject.repository.ProductRepository;
import project.finalproject.service.ProductFetchAllService;

@Service
public class ProductFetchAllServiceImple implements ProductFetchAllService{
	@Autowired
	private ProductRepository productRepository;

	public ProductFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Product> fetchAllProductData() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
