package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.ShippingDetails;
import project.finalproject.repository.ShippingDetailsRepository;
import project.finalproject.service.ShippingDetailsSaveService;
@Service
public class ShippingDetailsSaveServiceImple implements ShippingDetailsSaveService{
	@Autowired
	private ShippingDetailsRepository shippingDetailsRepository;
	
	public ShippingDetailsSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ShippingDetails saveShippingDetailsData(ShippingDetails shippingDetails) {
		// TODO Auto-generated method stub
		return shippingDetailsRepository.save(shippingDetails);
	}

}
