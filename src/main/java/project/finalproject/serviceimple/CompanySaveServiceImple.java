package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Company;
import project.finalproject.repository.CompanyRepository;
import project.finalproject.service.CompanySaveService;

@Service
public class CompanySaveServiceImple implements CompanySaveService{
	@Autowired
	private CompanyRepository companyRepository;

	public CompanySaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Company saveCompanyData(Company company) {
		// TODO Auto-generated method stub
		Company newCompany = project.finalproject.factory.CompanyFactory.createCompany();
		org.springframework.beans.BeanUtils.copyProperties(company, newCompany);
		return companyRepository.save(newCompany);
	}

}
