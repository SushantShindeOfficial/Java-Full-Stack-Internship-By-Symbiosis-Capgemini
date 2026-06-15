package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.CompanyResponse;
import project.finalproject.repository.CompanyResponseRepository;
import project.finalproject.service.CompanyResponseSaveService;
@Service
public class CompanyResponseSaveServiceImple implements CompanyResponseSaveService{
	@Autowired
	private CompanyResponseRepository companyResponseRepository;
	
	public CompanyResponseSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public CompanyResponse saveCompanyResponseData(CompanyResponse companyResponse) {
		// TODO Auto-generated method stub
		return companyResponseRepository.save(companyResponse);
	}

}
