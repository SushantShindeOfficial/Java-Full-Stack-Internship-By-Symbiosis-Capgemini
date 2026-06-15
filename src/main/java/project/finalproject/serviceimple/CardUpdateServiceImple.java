package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Card;
import project.finalproject.repository.CardRepository;
import project.finalproject.service.CardUpdateService;

@Service
public class CardUpdateServiceImple implements CardUpdateService{
	@Autowired
	private CardRepository cardRepository;
	
	public CardUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Card updateCardData(Card card, int cid) {
		// TODO Auto-generated method stub
		Card existingEntity = cardRepository.findById(cid).get();
		Card c1 = project.finalproject.factory.CardFactory.createCard();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, c1);
		c1.setAmount(card.getAmount());
		c1.setUser(card.getUser());
		
		return cardRepository.save(c1);
	}

}
