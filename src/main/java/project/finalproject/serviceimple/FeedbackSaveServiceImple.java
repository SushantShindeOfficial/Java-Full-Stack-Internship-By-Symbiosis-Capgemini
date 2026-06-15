package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Feedback;
import project.finalproject.repository.FeedbackRepository;
import project.finalproject.service.FeedbackSaveService;
@Service
public class FeedbackSaveServiceImple implements FeedbackSaveService{
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	public FeedbackSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Feedback saveFeedbackData(Feedback feedback) {
		// TODO Auto-generated method stub
		return feedbackRepository.save(feedback);
	}

}
