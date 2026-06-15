package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.SubCategory;
import project.finalproject.serviceimple.SubCategorySaveServiceImple;
import project.finalproject.serviceimple.SubCategoryFetchServiceImple;
import project.finalproject.serviceimple.SubCategoryFetchAllServiceImple;
import project.finalproject.serviceimple.SubCategoryUpdateServiceImple;
import project.finalproject.serviceimple.SubCategoryDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/subCategory")
public class SubCategoryController {
	@Autowired
	private SubCategorySaveServiceImple subCategorySaveServiceImple;

	@Autowired
	private SubCategoryUpdateServiceImple subCategoryUpdateServiceImple;

	@Autowired
	private SubCategoryDeleteServiceImple subCategoryDeleteServiceImple;

	@Autowired
	private SubCategoryFetchServiceImple subCategoryFetchServiceImple;

	@Autowired
	private SubCategoryFetchAllServiceImple subCategoryFetchAllServiceImple;

	@PostMapping("/saveSubCategory")
	public ResponseEntity<SubCategory> saveSubCategory(@RequestBody SubCategory subCategory) {
		SubCategory e1 = subCategorySaveServiceImple.saveSubCategoryData(subCategory);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateSubCategory/{sid}")
	public ResponseEntity<SubCategory> updateSubCategory(@RequestBody SubCategory subCategory, @PathVariable int sid) {
		SubCategory e1 = subCategoryUpdateServiceImple.updateSubCategoryData(subCategory, sid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteSubCategory/{sid}")
	public ResponseEntity<String> deleteSubCategory(@PathVariable int sid) {
		subCategoryDeleteServiceImple.deleteSubCategoryData(sid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("SubCategory deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleSubCategory/{sid}")
	public ResponseEntity<SubCategory> singleSubCategoryData(@PathVariable int sid) {
		SubCategory e1 = subCategoryFetchServiceImple.fetchSubCategoryData(sid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllSubCategoryData")
	public ResponseEntity<List<SubCategory>> allSubCategoryData() {
		List<SubCategory> l1 = subCategoryFetchAllServiceImple.fetchAllSubCategoryData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}
