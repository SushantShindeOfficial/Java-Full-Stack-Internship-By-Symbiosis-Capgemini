package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Company;
import project.finalproject.repository.CompanyRepository;
import project.finalproject.service.CompanyFetchService;

@Service
public class CompanyFetchServiceImple implements CompanyFetchService{
	@Autowired
	private CompanyRepository companyRepository;

	public CompanyFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Company fetchCompanyData(int regNo) {
		// TODO Auto-generated method stub
		return companyRepository.findById(regNo).get();
	}

}
