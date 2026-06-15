package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.CardRepository;
import project.finalproject.service.CardDeleteService;
@Service
public class CardDeleteServiceImple implements CardDeleteService{
	@Autowired
	private CardRepository cardRepository;
	
	public CardDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteCardData(int cid) {
		// TODO Auto-generated method stub
		cardRepository.deleteById(cid);
	}

}
