package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Category;
import project.finalproject.serviceimple.CategorySaveServiceImple;
import project.finalproject.serviceimple.CategoryFetchServiceImple;
import project.finalproject.serviceimple.CategoryFetchAllServiceImple;
import project.finalproject.serviceimple.CategoryUpdateServiceImple;
import project.finalproject.serviceimple.CategoryDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private CategorySaveServiceImple categorySaveServiceImple;

	@Autowired
	private CategoryUpdateServiceImple categoryUpdateServiceImple;

	@Autowired
	private CategoryDeleteServiceImple categoryDeleteServiceImple;

	@Autowired
	private CategoryFetchServiceImple categoryFetchServiceImple;

	@Autowired
	private CategoryFetchAllServiceImple categoryFetchAllServiceImple;

	@PostMapping("/saveCategory")
	public ResponseEntity<Category> saveCategory(@RequestBody Category category) {
		Category e1 = categorySaveServiceImple.saveCategoryData(category);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateCategory/{cid}")
	public ResponseEntity<Category> updateCategory(@RequestBody Category category, @PathVariable int cid) {
		Category e1 = categoryUpdateServiceImple.updateCategoryData(category, cid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteCategory/{cid}")
	public ResponseEntity<String> deleteCategory(@PathVariable int cid) {
		categoryDeleteServiceImple.deleteCategoryData(cid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("Category deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleCategory/{cid}")
	public ResponseEntity<Category> singleCategoryData(@PathVariable int cid) {
		Category e1 = categoryFetchServiceImple.fetchCategoryData(cid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllCategoryData")
	public ResponseEntity<List<Category>> allCategoryData() {
		List<Category> l1 = categoryFetchAllServiceImple.fetchAllCategoryData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}
