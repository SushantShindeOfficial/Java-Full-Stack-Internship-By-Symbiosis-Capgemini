package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Country;
import project.finalproject.repository.CountryRepository;
import project.finalproject.service.CountryFetchService;
@Service
public class CountryFetchServiceImple implements CountryFetchService{
	@Autowired
	private CountryRepository countryRepository;
	
	public CountryFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Country fetchCountryData(int id) {
		// TODO Auto-generated method stub
		return countryRepository.findById(id).get();
	}

}
