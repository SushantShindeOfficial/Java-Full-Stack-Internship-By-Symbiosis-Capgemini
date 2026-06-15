package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.CustomerQueryRepository;
import project.finalproject.service.CustomerQueryDeleteService;
@Service
public class CustomerQueryDeleteServiceImple implements CustomerQueryDeleteService{
	@Autowired
	private CustomerQueryRepository customerQueryRepository;
	
	public CustomerQueryDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteCustomerQueryData(int id) {
		// TODO Auto-generated method stub
		customerQueryRepository.deleteById(id);
	}

}
