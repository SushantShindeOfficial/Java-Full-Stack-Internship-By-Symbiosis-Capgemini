package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.ShippingDetailsRepository;
import project.finalproject.service.ShippingDetailsDeleteService;
@Service
public class ShippingDetailsDeleteServiceImple implements ShippingDetailsDeleteService{
	@Autowired
	private ShippingDetailsRepository shippingDetailsRepository;
	
	public ShippingDetailsDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteShippingDetailsData(int sid) {
		// TODO Auto-generated method stub
		shippingDetailsRepository.deleteById(sid);
	}

}
