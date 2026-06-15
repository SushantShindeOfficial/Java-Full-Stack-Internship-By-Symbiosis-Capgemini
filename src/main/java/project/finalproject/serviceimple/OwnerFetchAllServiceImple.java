package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Owner;
import project.finalproject.repository.OwnerRepository;
import project.finalproject.service.OwnerFetchAllService;

@Service
public class OwnerFetchAllServiceImple implements OwnerFetchAllService{
	@Autowired
	private OwnerRepository ownerRepository;

	public OwnerFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Owner> fetchAllOwnerData() {
		// TODO Auto-generated method stub
		return ownerRepository.findAll();
	}

}
