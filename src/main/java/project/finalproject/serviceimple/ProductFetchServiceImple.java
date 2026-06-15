package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Product;
import project.finalproject.repository.ProductRepository;
import project.finalproject.service.ProductFetchService;

@Service
public class ProductFetchServiceImple implements ProductFetchService{
	@Autowired
	private ProductRepository productRepository;

	public ProductFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Product fetchProductData(int pid) {
		// TODO Auto-generated method stub
		return productRepository.findById(pid).get();
	}

}
