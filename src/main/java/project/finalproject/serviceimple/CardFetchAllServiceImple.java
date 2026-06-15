package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Card;
import project.finalproject.repository.CardRepository;
import project.finalproject.service.CardFetchAllService;
@Service
public class CardFetchAllServiceImple implements CardFetchAllService{
	@Autowired
	private CardRepository cardRepository;
	
	public CardFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Card> fetchAllCardData() {
		// TODO Auto-generated method stub
		return cardRepository.findAll();
	}

}
