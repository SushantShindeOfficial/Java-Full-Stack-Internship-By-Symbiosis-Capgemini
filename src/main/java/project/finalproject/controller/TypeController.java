package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Type;
import project.finalproject.serviceimple.TypeSaveServiceImple;
import project.finalproject.serviceimple.TypeFetchServiceImple;
import project.finalproject.serviceimple.TypeFetchAllServiceImple;
import project.finalproject.serviceimple.TypeUpdateServiceImple;
import project.finalproject.serviceimple.TypeDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/type")
public class TypeController {
	@Autowired
	private TypeSaveServiceImple typeSaveServiceImple;

	@Autowired
	private TypeUpdateServiceImple typeUpdateServiceImple;

	@Autowired
	private TypeDeleteServiceImple typeDeleteServiceImple;

	@Autowired
	private TypeFetchServiceImple typeFetchServiceImple;

	@Autowired
	private TypeFetchAllServiceImple typeFetchAllServiceImple;

	@PostMapping("/saveType")
	public ResponseEntity<Type> saveType(@RequestBody Type type) {
		Type e1 = typeSaveServiceImple.saveTypeData(type);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateType/{tid}")
	public ResponseEntity<Type> updateType(@RequestBody Type type, @PathVariable int tid) {
		Type e1 = typeUpdateServiceImple.updateTypeData(type, tid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteType/{tid}")
	public ResponseEntity<String> deleteType(@PathVariable int tid) {
		typeDeleteServiceImple.deleteTypeData(tid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("Type deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleType/{tid}")
	public ResponseEntity<Type> singleTypeData(@PathVariable int tid) {
		Type e1 = typeFetchServiceImple.fetchTypeData(tid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllTypeData")
	public ResponseEntity<List<Type>> allTypeData() {
		List<Type> l1 = typeFetchAllServiceImple.fetchAllTypeData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}
