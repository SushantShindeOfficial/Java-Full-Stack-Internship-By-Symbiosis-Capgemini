package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Tracking;
import project.finalproject.serviceimple.TrackingSaveServiceImple;
import project.finalproject.serviceimple.TrackingFetchServiceImple;
import project.finalproject.serviceimple.TrackingFetchAllServiceImple;
import project.finalproject.serviceimple.TrackingUpdateServiceImple;
import project.finalproject.serviceimple.TrackingDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/tracking")
public class TrackingController {
	@Autowired
	private TrackingSaveServiceImple trackingSaveServiceImple;

	@Autowired
	private TrackingUpdateServiceImple trackingUpdateServiceImple;

	@Autowired
	private TrackingDeleteServiceImple trackingDeleteServiceImple;

	@Autowired
	private TrackingFetchServiceImple trackingFetchServiceImple;

	@Autowired
	private TrackingFetchAllServiceImple trackingFetchAllServiceImple;

	@PostMapping("/saveTracking")
	public ResponseEntity<Tracking> saveTracking(@RequestBody Tracking tracking) {
		Tracking e1 = trackingSaveServiceImple.saveTrackingData(tracking);
		return new ResponseEntity<Tracking>(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateTracking/{id}")
	public ResponseEntity<Tracking> updateTracking(@RequestBody Tracking tracking, @PathVariable int id) {
		Tracking e1 = trackingUpdateServiceImple.updateTrackingData(tracking, id);
		return new ResponseEntity<Tracking>(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteTracking/{id}")
	public ResponseEntity<String> deleteTracking(@PathVariable int id) {
		trackingDeleteServiceImple.deleteTrackingData(id);
		return new ResponseEntity<String>("Tracking deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleTracking/{id}")
	public ResponseEntity<Tracking> singleTrackingData(@PathVariable int id) {
		Tracking e1 = trackingFetchServiceImple.fetchTrackingData(id);
		return new ResponseEntity<Tracking>(e1, HttpStatus.OK);
	}

	@GetMapping("/AllTrackingData")
	public ResponseEntity<List<Tracking>> allTrackingData() {
		List<Tracking> l1 = trackingFetchAllServiceImple.fetchAllTrackingData();
		return new ResponseEntity<List<Tracking>>(l1, HttpStatus.OK);
	}
}
