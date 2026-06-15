package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.District;
import project.finalproject.repository.DistrictRepository;
import project.finalproject.service.DistrictFetchAllService;
@Service
public class DistrictFetchAllServiceImple implements DistrictFetchAllService{
	@Autowired
	private DistrictRepository districtRepository;
	
	public DistrictFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<District> fetchAllDistrictData() {
		// TODO Auto-generated method stub
		return districtRepository.findAll();
	}

}
