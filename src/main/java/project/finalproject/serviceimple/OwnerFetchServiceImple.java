package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Owner;
import project.finalproject.repository.OwnerRepository;
import project.finalproject.service.OwnerFetchService;

@Service
public class OwnerFetchServiceImple implements OwnerFetchService{
	@Autowired
	private OwnerRepository ownerRepository;

	public OwnerFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Owner fetchOwnerData(int id) {
		// TODO Auto-generated method stub
		return ownerRepository.findById(id).get();
	}

}
