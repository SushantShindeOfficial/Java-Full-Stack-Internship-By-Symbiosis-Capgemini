package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.CountryRepository;
import project.finalproject.service.CountryDeleteService;
@Service
public class CountryDeleteServiceImple implements CountryDeleteService{
	@Autowired
	private CountryRepository countryRepository;
	
	public CountryDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteCountryData(int id) {
		// TODO Auto-generated method stub
		countryRepository.deleteById(id);
	}

}
