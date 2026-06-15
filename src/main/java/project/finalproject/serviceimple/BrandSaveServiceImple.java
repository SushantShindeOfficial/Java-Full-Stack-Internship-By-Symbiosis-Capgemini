package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Brand;
import project.finalproject.repository.BrandRepository;
import project.finalproject.service.BrandSaveService;

@Service
public class BrandSaveServiceImple implements BrandSaveService{
	@Autowired
	private BrandRepository brandRepository;

	public BrandSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Brand saveBrandData(Brand brand) {
		// TODO Auto-generated method stub
		Brand newBrand = project.finalproject.factory.BrandFactory.createBrand();
		org.springframework.beans.BeanUtils.copyProperties(brand, newBrand);
		return brandRepository.save(newBrand);
	}

}
