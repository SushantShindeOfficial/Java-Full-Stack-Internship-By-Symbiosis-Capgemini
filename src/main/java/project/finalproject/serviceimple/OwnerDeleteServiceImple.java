package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.OwnerRepository;
import project.finalproject.service.OwnerDeleteService;

@Service
public class OwnerDeleteServiceImple implements OwnerDeleteService{
	@Autowired
	private OwnerRepository ownerRepository;

	public OwnerDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteOwnerData(int id) {
		// TODO Auto-generated method stub
		ownerRepository.deleteById(id);
	}

}
