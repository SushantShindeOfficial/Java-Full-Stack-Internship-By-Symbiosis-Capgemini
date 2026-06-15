package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.CustomerQuery;
import project.finalproject.repository.CustomerQueryRepository;
import project.finalproject.service.CustomerQuerySaveService;
@Service
public class CustomerQuerySaveServiceImple implements CustomerQuerySaveService{
	@Autowired
	private CustomerQueryRepository customerQueryRepository;
	
	public CustomerQuerySaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public CustomerQuery saveCustomerQueryData(CustomerQuery customerQuery) {
		// TODO Auto-generated method stub
		return customerQueryRepository.save(customerQuery);
	}

}
