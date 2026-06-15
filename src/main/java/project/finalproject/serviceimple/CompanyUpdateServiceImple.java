package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Company;
import project.finalproject.repository.CompanyRepository;
import project.finalproject.service.CompanyUpdateService;

@Service
public class CompanyUpdateServiceImple implements CompanyUpdateService{
	@Autowired
	private CompanyRepository companyRepository;

	public CompanyUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Company updateCompanyData(Company company, int regNo) {
		// TODO Auto-generated method stub
		Company c = companyRepository.findById(regNo).get();
		c.setName(company.getName());
		c.setAddress(company.getAddress());
		c.setOwner(company.getOwner());
		c.setManagers(company.getManagers());
		c.setAdmins(company.getAdmins());
		c.setEmployees(company.getEmployees());
		c.setDepts(company.getDepts());
		c.setTypes(company.getTypes());
		return companyRepository.save(c);
	}

}
