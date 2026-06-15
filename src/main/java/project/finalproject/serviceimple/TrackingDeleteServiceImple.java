package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.TrackingRepository;
import project.finalproject.service.TrackingDeleteService;
@Service
public class TrackingDeleteServiceImple implements TrackingDeleteService{
	@Autowired
	private TrackingRepository trackingRepository;
	
	public TrackingDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteTrackingData(int id) {
		// TODO Auto-generated method stub
		trackingRepository.deleteById(id);
	}

}
