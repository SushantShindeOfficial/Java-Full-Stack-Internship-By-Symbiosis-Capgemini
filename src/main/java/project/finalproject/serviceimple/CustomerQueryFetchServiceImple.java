package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.CustomerQuery;
import project.finalproject.repository.CustomerQueryRepository;
import project.finalproject.service.CustomerQueryFetchService;
@Service
public class CustomerQueryFetchServiceImple implements CustomerQueryFetchService{
	@Autowired
	private CustomerQueryRepository customerQueryRepository;
	
	public CustomerQueryFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public CustomerQuery fetchCustomerQueryData(int id) {
		// TODO Auto-generated method stub
		return customerQueryRepository.findById(id).get();
	}

}
