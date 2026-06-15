package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.CompanyResponse;
import project.finalproject.repository.CompanyResponseRepository;
import project.finalproject.service.CompanyResponseFetchAllService;
@Service
public class CompanyResponseFetchAllServiceImple implements CompanyResponseFetchAllService{
	@Autowired
	private CompanyResponseRepository companyResponseRepository;
	
	public CompanyResponseFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<CompanyResponse> fetchAllCompanyResponseData() {
		// TODO Auto-generated method stub
		return companyResponseRepository.findAll();
	}

}
