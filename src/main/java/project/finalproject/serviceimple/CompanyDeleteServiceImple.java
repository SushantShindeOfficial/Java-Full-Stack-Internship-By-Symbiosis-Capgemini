package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.CompanyRepository;
import project.finalproject.service.CompanyDeleteService;

@Service
public class CompanyDeleteServiceImple implements CompanyDeleteService{
	@Autowired
	private CompanyRepository companyRepository;

	public CompanyDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteCompanyData(int regNo) {
		// TODO Auto-generated method stub
		companyRepository.deleteById(regNo);
	}

}
