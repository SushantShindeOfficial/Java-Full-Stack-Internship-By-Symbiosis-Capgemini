package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Address;
import project.finalproject.repository.AddressRepository;
import project.finalproject.service.AddressSaveService;

@Service
public class AddressSaveServiceImple implements AddressSaveService{
	@Autowired
	private AddressRepository addressRepository;

	public AddressSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Address saveAddressData(Address address) {
		// TODO Auto-generated method stub
		return addressRepository.save(address);
	}

}
