package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Brand;
import project.finalproject.repository.BrandRepository;
import project.finalproject.service.BrandUpdateService;

@Service
public class BrandUpdateServiceImple implements BrandUpdateService{
	@Autowired
	private BrandRepository brandRepository;

	public BrandUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Brand updateBrandData(Brand brand, int bid) {
		// TODO Auto-generated method stub
		Brand existingEntity = brandRepository.findById(bid).get();
		Brand o1 = project.finalproject.factory.BrandFactory.createBrand();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, o1);
		o1.setName(brand.getName());
		o1.setProducts(brand.getProducts());
		o1.setCategories(brand.getCategories());
		o1.setSubCategories(brand.getSubCategories());
		return brandRepository.save(o1);
	}

}
