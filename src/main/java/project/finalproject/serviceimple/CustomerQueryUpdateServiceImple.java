package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.CustomerQuery;
import project.finalproject.repository.CustomerQueryRepository;
import project.finalproject.service.CustomerQueryUpdateService;

@Service
public class CustomerQueryUpdateServiceImple implements CustomerQueryUpdateService{
	@Autowired
	private CustomerQueryRepository customerQueryRepository;
	
	public CustomerQueryUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public CustomerQuery updateCustomerQueryData(CustomerQuery customerQuery, int id) {
		// TODO Auto-generated method stub
		CustomerQuery c1 = customerQueryRepository.findById(id).get();
		c1.setShippingdetails(customerQuery.getShippingdetails());
		c1.setInvoice(customerQuery.getInvoice());
		
		return customerQueryRepository.save(c1);
	}

}
