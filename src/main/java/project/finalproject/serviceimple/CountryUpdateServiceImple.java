package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Country;
import project.finalproject.repository.CountryRepository;
import project.finalproject.service.CountryUpdateService;

@Service
public class CountryUpdateServiceImple implements CountryUpdateService{
	@Autowired
	private CountryRepository countryRepository;
	
	public CountryUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Country updateCountryData(Country country, int id) {
		// TODO Auto-generated method stub
		Country existingEntity = countryRepository.findById(id).get();
		Country c1 = project.finalproject.factory.CountryFactory.createCountry();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, c1);
		c1.setName(country.getName());
		c1.setStates(country.getStates());
		
		return countryRepository.save(c1);
	}

}
