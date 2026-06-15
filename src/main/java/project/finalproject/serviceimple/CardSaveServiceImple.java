package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Card;
import project.finalproject.repository.CardRepository;
import project.finalproject.service.CardSaveService;
@Service
public class CardSaveServiceImple implements CardSaveService{
	@Autowired
	private CardRepository cardRepository;
	
	public CardSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Card saveCardData(Card card) {
		// TODO Auto-generated method stub
		return cardRepository.save(card);
	}

}
