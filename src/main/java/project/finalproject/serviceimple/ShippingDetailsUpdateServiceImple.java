package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.ShippingDetails;
import project.finalproject.repository.ShippingDetailsRepository;
import project.finalproject.service.ShippingDetailsUpdateService;

@Service
public class ShippingDetailsUpdateServiceImple implements ShippingDetailsUpdateService{
	@Autowired
	private ShippingDetailsRepository shippingDetailsRepository;
	
	public ShippingDetailsUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ShippingDetails updateShippingDetailsData(ShippingDetails shippingDetails, int sid) {
		// TODO Auto-generated method stub
		ShippingDetails existingEntity = shippingDetailsRepository.findById(sid).get();
		ShippingDetails s1 = project.finalproject.factory.ShippingDetailsFactory.createShippingDetails();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, s1);
		s1.setUsers(shippingDetails.getUsers());
		
		return shippingDetailsRepository.save(s1);
	}

}
