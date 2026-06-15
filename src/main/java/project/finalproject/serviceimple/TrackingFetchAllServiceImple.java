package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Tracking;
import project.finalproject.repository.TrackingRepository;
import project.finalproject.service.TrackingFetchAllService;
@Service
public class TrackingFetchAllServiceImple implements TrackingFetchAllService{
	@Autowired
	private TrackingRepository trackingRepository;
	
	public TrackingFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Tracking> fetchAllTrackingData() {
		// TODO Auto-generated method stub
		return trackingRepository.findAll();
	}

}
