package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.ShippingDetails;
import project.finalproject.repository.ShippingDetailsRepository;
import project.finalproject.service.ShippingDetailsFetchService;
@Service
public class ShippingDetailsFetchServiceImple implements ShippingDetailsFetchService{
	@Autowired
	private ShippingDetailsRepository shippingDetailsRepository;
	
	public ShippingDetailsFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ShippingDetails fetchShippingDetailsData(int sid) {
		// TODO Auto-generated method stub
		return shippingDetailsRepository.findById(sid).get();
	}

}
