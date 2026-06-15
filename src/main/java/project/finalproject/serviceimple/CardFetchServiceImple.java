package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Card;
import project.finalproject.repository.CardRepository;
import project.finalproject.service.CardFetchService;
@Service
public class CardFetchServiceImple implements CardFetchService{
	@Autowired
	private CardRepository cardRepository;
	
	public CardFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Card fetchCardData(int cid) {
		// TODO Auto-generated method stub
		return cardRepository.findById(cid).get();
	}

}
