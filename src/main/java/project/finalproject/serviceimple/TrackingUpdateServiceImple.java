package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Tracking;
import project.finalproject.repository.TrackingRepository;
import project.finalproject.service.TrackingUpdateService;

@Service
public class TrackingUpdateServiceImple implements TrackingUpdateService{
	@Autowired
	private TrackingRepository trackingRepository;
	
	public TrackingUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Tracking updateTrackingData(Tracking tracking, int id) {
		// TODO Auto-generated method stub
		Tracking existingEntity = trackingRepository.findById(id).get();
		Tracking t1 = project.finalproject.factory.TrackingFactory.createTracking();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, t1);
		
		return trackingRepository.save(t1);
	}

}
