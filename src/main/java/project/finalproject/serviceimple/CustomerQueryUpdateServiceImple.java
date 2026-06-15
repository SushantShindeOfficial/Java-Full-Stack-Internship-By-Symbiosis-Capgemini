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
		CustomerQuery existingEntity = customerQueryRepository.findById(id).get();
		CustomerQuery c1 = project.finalproject.factory.CustomerQueryFactory.createCustomerQuery();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, c1);
		c1.setShippingdetails(customerQuery.getShippingdetails());
		c1.setInvoice(customerQuery.getInvoice());
		
		return customerQueryRepository.save(c1);
	}

}
