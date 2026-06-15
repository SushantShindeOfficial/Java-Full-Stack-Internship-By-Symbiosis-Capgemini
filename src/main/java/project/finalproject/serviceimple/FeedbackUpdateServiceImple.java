package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Feedback;
import project.finalproject.repository.FeedbackRepository;
import project.finalproject.service.FeedbackUpdateService;

@Service
public class FeedbackUpdateServiceImple implements FeedbackUpdateService{
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	public FeedbackUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Feedback updateFeedbackData(Feedback feedback, int id) {
		// TODO Auto-generated method stub
		Feedback f1 = feedbackRepository.findById(id).get();
		f1.setCquery(feedback.getCquery());
		f1.setcResponse(feedback.getcResponse());
		
		return feedbackRepository.save(f1);
	}

}
