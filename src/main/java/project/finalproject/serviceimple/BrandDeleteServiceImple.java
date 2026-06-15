package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.BrandRepository;
import project.finalproject.service.BrandDeleteService;

@Service
public class BrandDeleteServiceImple implements BrandDeleteService{
	@Autowired
	private BrandRepository brandRepository;

	public BrandDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteBrandData(int bid) {
		// TODO Auto-generated method stub
		brandRepository.deleteById(bid);
	}

}
