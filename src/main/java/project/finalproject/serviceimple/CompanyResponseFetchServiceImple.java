package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.CompanyResponse;
import project.finalproject.repository.CompanyResponseRepository;
import project.finalproject.service.CompanyResponseFetchService;
@Service
public class CompanyResponseFetchServiceImple implements CompanyResponseFetchService{
	@Autowired
	private CompanyResponseRepository companyResponseRepository;
	
	public CompanyResponseFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public CompanyResponse fetchCompanyResponseData(int id) {
		// TODO Auto-generated method stub
		return companyResponseRepository.findById(id).get();
	}

}
