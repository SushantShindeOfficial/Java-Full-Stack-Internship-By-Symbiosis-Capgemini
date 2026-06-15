package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.ShippingDetails;
import project.finalproject.repository.ShippingDetailsRepository;
import project.finalproject.service.ShippingDetailsFetchAllService;
@Service
public class ShippingDetailsFetchAllServiceImple implements ShippingDetailsFetchAllService{
	@Autowired
	private ShippingDetailsRepository shippingDetailsRepository;
	
	public ShippingDetailsFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ShippingDetails> fetchAllShippingDetailsData() {
		// TODO Auto-generated method stub
		return shippingDetailsRepository.findAll();
	}

}
