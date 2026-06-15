package spring.web.app.project.serviceImple;

import spring.web.app.project.entity.Address;
import spring.web.app.project.repository.AddressRepository;
import spring.web.app.project.service.AddressService;

public class AddressServiceImple implements AddressService{
	private  AddressRepository addressRepository;

	@Override
	public Address SaveAddress() {
		// TODO Auto-generated method stub
		
		Address a1 = new Address();
	    a1.setAddressid(1);
	    a1.setArea("Shahu Nagar");
	    a1.setFlatno(101);
		return addressRepository.save(a1);
	}
	

}
