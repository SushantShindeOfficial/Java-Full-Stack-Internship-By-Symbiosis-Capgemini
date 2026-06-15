package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Address;
import project.finalproject.repository.AddressRepository;
import project.finalproject.service.AddressFetchAllService;

@Service
public class AddressFetchAllServiceImple implements AddressFetchAllService{
	@Autowired
	private AddressRepository addressRepository;

	public AddressFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Address> fetchAllAddressData() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

}
