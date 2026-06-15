package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Country;
import project.finalproject.repository.CountryRepository;
import project.finalproject.service.CountrySaveService;
@Service
public class CountrySaveServiceImple implements CountrySaveService{
	@Autowired
	private CountryRepository countryRepository;
	
	public CountrySaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Country saveCountryData(Country country) {
		// TODO Auto-generated method stub
		return countryRepository.save(country);
	}

}
