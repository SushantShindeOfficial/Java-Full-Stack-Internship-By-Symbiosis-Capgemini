package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Tracking;
import project.finalproject.repository.TrackingRepository;
import project.finalproject.service.TrackingSaveService;
@Service
public class TrackingSaveServiceImple implements TrackingSaveService{
	@Autowired
	private TrackingRepository trackingRepository;
	
	public TrackingSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Tracking saveTrackingData(Tracking tracking) {
		// TODO Auto-generated method stub
		return trackingRepository.save(tracking);
	}

}
