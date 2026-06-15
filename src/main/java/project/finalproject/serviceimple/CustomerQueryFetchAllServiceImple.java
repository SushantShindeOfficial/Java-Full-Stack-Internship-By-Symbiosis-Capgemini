package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.CustomerQuery;
import project.finalproject.repository.CustomerQueryRepository;
import project.finalproject.service.CustomerQueryFetchAllService;
@Service
public class CustomerQueryFetchAllServiceImple implements CustomerQueryFetchAllService{
	@Autowired
	private CustomerQueryRepository customerQueryRepository;
	
	public CustomerQueryFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<CustomerQuery> fetchAllCustomerQueryData() {
		// TODO Auto-generated method stub
		return customerQueryRepository.findAll();
	}

}
