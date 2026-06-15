package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Feedback;
import project.finalproject.repository.FeedbackRepository;
import project.finalproject.service.FeedbackFetchAllService;
@Service
public class FeedbackFetchAllServiceImple implements FeedbackFetchAllService{
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	public FeedbackFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Feedback> fetchAllFeedbackData() {
		// TODO Auto-generated method stub
		return feedbackRepository.findAll();
	}

}
