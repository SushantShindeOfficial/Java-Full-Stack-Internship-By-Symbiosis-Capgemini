package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Brand;
import project.finalproject.repository.BrandRepository;
import project.finalproject.service.BrandFetchAllService;

@Service
public class BrandFetchAllServiceImple implements BrandFetchAllService{
	@Autowired
	private BrandRepository brandRepository;

	public BrandFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Brand> fetchAllBrandData() {
		// TODO Auto-generated method stub
		return brandRepository.findAll();
	}

}
