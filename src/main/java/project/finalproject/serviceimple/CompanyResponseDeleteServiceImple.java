package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.CompanyResponseRepository;
import project.finalproject.service.CompanyResponseDeleteService;
@Service
public class CompanyResponseDeleteServiceImple implements CompanyResponseDeleteService{
	@Autowired
	private CompanyResponseRepository companyResponseRepository;
	
	public CompanyResponseDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteCompanyResponseData(int id) {
		// TODO Auto-generated method stub
		companyResponseRepository.deleteById(id);
	}

}
