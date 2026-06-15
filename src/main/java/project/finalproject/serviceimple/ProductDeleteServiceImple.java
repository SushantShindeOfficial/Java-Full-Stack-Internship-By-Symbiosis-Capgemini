package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.ProductRepository;
import project.finalproject.service.ProductDeleteService;

@Service
public class ProductDeleteServiceImple implements ProductDeleteService{
	@Autowired
	private ProductRepository productRepository;

	public ProductDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteProductData(int pid) {
		// TODO Auto-generated method stub
		productRepository.deleteById(pid);
	}

}
