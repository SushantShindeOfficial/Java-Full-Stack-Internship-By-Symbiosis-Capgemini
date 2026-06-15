package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Address;
import project.finalproject.repository.AddressRepository;
import project.finalproject.service.AddressFetchService;

@Service
public class AddressFetchServiceImple implements AddressFetchService{
	@Autowired
	private AddressRepository addressRepository;

	public AddressFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Address fetchAddressData(int flatno) {
		// TODO Auto-generated method stub
		return addressRepository.findById(flatno).get();
	}

}
