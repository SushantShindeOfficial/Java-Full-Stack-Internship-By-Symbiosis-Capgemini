package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.FeedbackRepository;
import project.finalproject.service.FeedbackDeleteService;
@Service
public class FeedbackDeleteServiceImple implements FeedbackDeleteService{
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	public FeedbackDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteFeedbackData(int id) {
		// TODO Auto-generated method stub
		feedbackRepository.deleteById(id);
	}

}
