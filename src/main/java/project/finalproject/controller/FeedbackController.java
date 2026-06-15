package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Feedback;
import project.finalproject.serviceimple.FeedbackSaveServiceImple;
import project.finalproject.serviceimple.FeedbackFetchServiceImple;
import project.finalproject.serviceimple.FeedbackFetchAllServiceImple;
import project.finalproject.serviceimple.FeedbackUpdateServiceImple;
import project.finalproject.serviceimple.FeedbackDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	@Autowired
	private FeedbackSaveServiceImple feedbackSaveServiceImple;

	@Autowired
	private FeedbackUpdateServiceImple feedbackUpdateServiceImple;

	@Autowired
	private FeedbackDeleteServiceImple feedbackDeleteServiceImple;

	@Autowired
	private FeedbackFetchServiceImple feedbackFetchServiceImple;

	@Autowired
	private FeedbackFetchAllServiceImple feedbackFetchAllServiceImple;

	@PostMapping("/saveFeedback")
	public ResponseEntity<Feedback> saveFeedback(@RequestBody Feedback feedback) {
		Feedback e1 = feedbackSaveServiceImple.saveFeedbackData(feedback);
		return new ResponseEntity<Feedback>(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateFeedback/{id}")
	public ResponseEntity<Feedback> updateFeedback(@RequestBody Feedback feedback, @PathVariable int id) {
		Feedback e1 = feedbackUpdateServiceImple.updateFeedbackData(feedback, id);
		return new ResponseEntity<Feedback>(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteFeedback/{id}")
	public ResponseEntity<String> deleteFeedback(@PathVariable int id) {
		feedbackDeleteServiceImple.deleteFeedbackData(id);
		return new ResponseEntity<String>("Feedback deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleFeedback/{id}")
	public ResponseEntity<Feedback> singleFeedbackData(@PathVariable int id) {
		Feedback e1 = feedbackFetchServiceImple.fetchFeedbackData(id);
		return new ResponseEntity<Feedback>(e1, HttpStatus.OK);
	}

	@GetMapping("/AllFeedbackData")
	public ResponseEntity<List<Feedback>> allFeedbackData() {
		List<Feedback> l1 = feedbackFetchAllServiceImple.fetchAllFeedbackData();
		return new ResponseEntity<List<Feedback>>(l1, HttpStatus.OK);
	}
}
