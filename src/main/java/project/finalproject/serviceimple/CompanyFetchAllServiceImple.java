package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Company;
import project.finalproject.repository.CompanyRepository;
import project.finalproject.service.CompanyFetchAllService;

@Service
public class CompanyFetchAllServiceImple implements CompanyFetchAllService{
	@Autowired
	private CompanyRepository companyRepository;

	public CompanyFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Company> fetchAllCompanyData() {
		// TODO Auto-generated method stub
		return companyRepository.findAll();
	}

}
