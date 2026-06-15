package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.District;
import project.finalproject.repository.DistrictRepository;
import project.finalproject.service.DistrictUpdateService;

@Service
public class DistrictUpdateServiceImple implements DistrictUpdateService{
	@Autowired
	private DistrictRepository districtRepository;
	
	public DistrictUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public District updateDistrictData(District district, int id) {
		// TODO Auto-generated method stub
		District existingEntity = districtRepository.findById(id).get();
		District d1 = project.finalproject.factory.DistrictFactory.createDistrict();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, d1);
		d1.setName(district.getName());
		d1.setTalukas(district.getTalukas());
		
		return districtRepository.save(d1);
	}

}
