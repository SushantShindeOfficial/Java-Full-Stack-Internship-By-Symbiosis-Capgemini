package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Owner;
import project.finalproject.repository.OwnerRepository;
import project.finalproject.service.OwnerUpdateService;

@Service
public class OwnerUpdateServiceImple implements OwnerUpdateService{
	@Autowired
	private OwnerRepository ownerRepository;

	public OwnerUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Owner updateOwnerData(Owner owner, int id) {
		// TODO Auto-generated method stub
		Owner o1=ownerRepository.findById(id).get();
		o1.setName(owner.getName());
		o1.setAdhar(owner.getAdhar());
		o1.setPanno(owner.getPanno());
		o1.setMailid(owner.getMailid());
		o1.setIncome(owner.getIncome());
		o1.setExperience(owner.getExperience());
		o1.setDob(owner.getDob());
		o1.setMobileNO(owner.getMobileNO());
		o1.setAddress(owner.getAddress());
		o1.setCompany(owner.getCompany());
		o1.setManagers(owner.getManagers());
		return ownerRepository.save(o1);
	}

}
