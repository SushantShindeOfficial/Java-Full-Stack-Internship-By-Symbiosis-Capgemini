package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.District;
import project.finalproject.repository.DistrictRepository;
import project.finalproject.service.DistrictSaveService;
@Service
public class DistrictSaveServiceImple implements DistrictSaveService{
	@Autowired
	private DistrictRepository districtRepository;
	
	public DistrictSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public District saveDistrictData(District district) {
		// TODO Auto-generated method stub
		return districtRepository.save(district);
	}

}
