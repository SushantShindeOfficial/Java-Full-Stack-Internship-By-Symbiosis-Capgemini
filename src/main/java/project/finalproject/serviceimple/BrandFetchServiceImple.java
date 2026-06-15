package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Brand;
import project.finalproject.repository.BrandRepository;
import project.finalproject.service.BrandFetchService;

@Service
public class BrandFetchServiceImple implements BrandFetchService{
	@Autowired
	private BrandRepository brandRepository;

	public BrandFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Brand fetchBrandData(int bid) {
		// TODO Auto-generated method stub
		return brandRepository.findById(bid).get();
	}

}
