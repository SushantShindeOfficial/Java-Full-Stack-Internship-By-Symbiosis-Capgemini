package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.AddressRepository;
import project.finalproject.service.AddressDeleteService;

@Service
public class AddressDeleteServiceImple implements AddressDeleteService{
	@Autowired
	private AddressRepository addressRepository;

	public AddressDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteAddressData(int flatno) {
		// TODO Auto-generated method stub
		addressRepository.deleteById(flatno);
	}

}
