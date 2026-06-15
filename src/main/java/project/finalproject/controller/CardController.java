package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Card;
import project.finalproject.serviceimple.CardSaveServiceImple;
import project.finalproject.serviceimple.CardFetchServiceImple;
import project.finalproject.serviceimple.CardFetchAllServiceImple;
import project.finalproject.serviceimple.CardUpdateServiceImple;
import project.finalproject.serviceimple.CardDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/card")
public class CardController {
	@Autowired
	private CardSaveServiceImple cardSaveServiceImple;

	@Autowired
	private CardUpdateServiceImple cardUpdateServiceImple;

	@Autowired
	private CardDeleteServiceImple cardDeleteServiceImple;

	@Autowired
	private CardFetchServiceImple cardFetchServiceImple;

	@Autowired
	private CardFetchAllServiceImple cardFetchAllServiceImple;

	@PostMapping("/saveCard")
	public ResponseEntity<Card> saveCard(@RequestBody Card card) {
		Card e1 = cardSaveServiceImple.saveCardData(card);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateCard/{cid}")
	public ResponseEntity<Card> updateCard(@RequestBody Card card, @PathVariable int cid) {
		Card e1 = cardUpdateServiceImple.updateCardData(card, cid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteCard/{cid}")
	public ResponseEntity<String> deleteCard(@PathVariable int cid) {
		cardDeleteServiceImple.deleteCardData(cid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("Card deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleCard/{cid}")
	public ResponseEntity<Card> singleCardData(@PathVariable int cid) {
		Card e1 = cardFetchServiceImple.fetchCardData(cid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllCardData")
	public ResponseEntity<List<Card>> allCardData() {
		List<Card> l1 = cardFetchAllServiceImple.fetchAllCardData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}
