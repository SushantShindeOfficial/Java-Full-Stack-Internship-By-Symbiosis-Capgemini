package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.CompanyResponse;
import project.finalproject.repository.CompanyResponseRepository;
import project.finalproject.service.CompanyResponseUpdateService;

@Service
public class CompanyResponseUpdateServiceImple implements CompanyResponseUpdateService{
	@Autowired
	private CompanyResponseRepository companyResponseRepository;
	
	public CompanyResponseUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public CompanyResponse updateCompanyResponseData(CompanyResponse companyResponse, int id) {
		// TODO Auto-generated method stub
		CompanyResponse existingEntity = companyResponseRepository.findById(id).get();
		CompanyResponse c1 = project.finalproject.factory.CompanyResponseFactory.createCompanyResponse();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, c1);
		c1.setCustomerQueries(companyResponse.getCustomerQueries());
		c1.setMessage(companyResponse.getMessage());
		
		return companyResponseRepository.save(c1);
	}

}
