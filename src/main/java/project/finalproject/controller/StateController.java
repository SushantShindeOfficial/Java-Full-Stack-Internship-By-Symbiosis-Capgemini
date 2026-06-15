package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.State;
import project.finalproject.serviceimple.StateSaveServiceImple;
import project.finalproject.serviceimple.StateFetchServiceImple;
import project.finalproject.serviceimple.StateFetchAllServiceImple;
import project.finalproject.serviceimple.StateUpdateServiceImple;
import project.finalproject.serviceimple.StateDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/state")
public class StateController {
	@Autowired
	private StateSaveServiceImple stateSaveServiceImple;

	@Autowired
	private StateUpdateServiceImple stateUpdateServiceImple;

	@Autowired
	private StateDeleteServiceImple stateDeleteServiceImple;

	@Autowired
	private StateFetchServiceImple stateFetchServiceImple;

	@Autowired
	private StateFetchAllServiceImple stateFetchAllServiceImple;

	@PostMapping("/saveState")
	public ResponseEntity<State> saveState(@RequestBody State state) {
		State e1 = stateSaveServiceImple.saveStateData(state);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateState/{id}")
	public ResponseEntity<State> updateState(@RequestBody State state, @PathVariable int id) {
		State e1 = stateUpdateServiceImple.updateStateData(state, id);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteState/{id}")
	public ResponseEntity<String> deleteState(@PathVariable int id) {
		stateDeleteServiceImple.deleteStateData(id);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("State deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleState/{id}")
	public ResponseEntity<State> singleStateData(@PathVariable int id) {
		State e1 = stateFetchServiceImple.fetchStateData(id);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllStateData")
	public ResponseEntity<List<State>> allStateData() {
		List<State> l1 = stateFetchAllServiceImple.fetchAllStateData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}
