package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Feedback;
import project.finalproject.repository.FeedbackRepository;
import project.finalproject.service.FeedbackFetchService;
@Service
public class FeedbackFetchServiceImple implements FeedbackFetchService{
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	public FeedbackFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Feedback fetchFeedbackData(int id) {
		// TODO Auto-generated method stub
		return feedbackRepository.findById(id).get();
	}

}
