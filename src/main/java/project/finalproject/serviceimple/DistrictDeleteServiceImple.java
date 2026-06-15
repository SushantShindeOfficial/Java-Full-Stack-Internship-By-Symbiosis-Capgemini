package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.DistrictRepository;
import project.finalproject.service.DistrictDeleteService;
@Service
public class DistrictDeleteServiceImple implements DistrictDeleteService{
	@Autowired
	private DistrictRepository districtRepository;
	
	public DistrictDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteDistrictData(int id) {
		// TODO Auto-generated method stub
		districtRepository.deleteById(id);
	}

}
