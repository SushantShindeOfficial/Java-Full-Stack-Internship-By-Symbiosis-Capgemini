package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.District;
import project.finalproject.repository.DistrictRepository;
import project.finalproject.service.DistrictFetchService;
@Service
public class DistrictFetchServiceImple implements DistrictFetchService{
	@Autowired
	private DistrictRepository districtRepository;
	
	public DistrictFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public District fetchDistrictData(int id) {
		// TODO Auto-generated method stub
		return districtRepository.findById(id).get();
	}

}
