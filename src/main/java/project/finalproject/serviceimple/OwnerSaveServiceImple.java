package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Owner;
import project.finalproject.repository.OwnerRepository;
import project.finalproject.service.OwnerSaveService;

@Service
public class OwnerSaveServiceImple implements OwnerSaveService{
	@Autowired
	private OwnerRepository ownerRepository;

	public OwnerSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Owner saveOwnerData(Owner owner) {
		// TODO Auto-generated method stub
		return ownerRepository.save(owner);
	}

}
