package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Country;
import project.finalproject.repository.CountryRepository;
import project.finalproject.service.CountryFetchAllService;
@Service
public class CountryFetchAllServiceImple implements CountryFetchAllService{
	@Autowired
	private CountryRepository countryRepository;
	
	public CountryFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Country> fetchAllCountryData() {
		// TODO Auto-generated method stub
		return countryRepository.findAll();
	}

}
