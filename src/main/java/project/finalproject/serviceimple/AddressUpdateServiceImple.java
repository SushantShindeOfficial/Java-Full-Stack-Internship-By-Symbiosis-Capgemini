package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Address;
import project.finalproject.repository.AddressRepository;
import project.finalproject.service.AddressUpdateService;

@Service
public class AddressUpdateServiceImple implements AddressUpdateService{
	@Autowired
	private AddressRepository addressRepository;

	public AddressUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Address updateAddressData(Address address, int flatno) {
		// TODO Auto-generated method stub
		Address a = addressRepository.findById(flatno).get();
		a.setArea(address.getArea());
		a.setTown(address.getTown());
		a.setTaluka(address.getTaluka());
		a.setDistrict(address.getDistrict());
		a.setState(address.getState());
		a.setCountry(address.getCountry());
		a.setPincode(address.getPincode());
		return addressRepository.save(a);
	}

}
