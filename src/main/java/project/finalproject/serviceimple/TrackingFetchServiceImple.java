package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Tracking;
import project.finalproject.repository.TrackingRepository;
import project.finalproject.service.TrackingFetchService;
@Service
public class TrackingFetchServiceImple implements TrackingFetchService{
	@Autowired
	private TrackingRepository trackingRepository;
	
	public TrackingFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Tracking fetchTrackingData(int id) {
		// TODO Auto-generated method stub
		return trackingRepository.findById(id).get();
	}

}
