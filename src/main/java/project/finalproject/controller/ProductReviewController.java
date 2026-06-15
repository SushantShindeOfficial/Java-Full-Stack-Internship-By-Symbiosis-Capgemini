package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.ProductReview;
import project.finalproject.serviceimple.ProductReviewSaveServiceImple;
import project.finalproject.serviceimple.ProductReviewFetchServiceImple;
import project.finalproject.serviceimple.ProductReviewFetchAllServiceImple;
import project.finalproject.serviceimple.ProductReviewUpdateServiceImple;
import project.finalproject.serviceimple.ProductReviewDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/productReview")
public class ProductReviewController {
	@Autowired
	private ProductReviewSaveServiceImple productReviewSaveServiceImple;

	@Autowired
	private ProductReviewUpdateServiceImple productReviewUpdateServiceImple;

	@Autowired
	private ProductReviewDeleteServiceImple productReviewDeleteServiceImple;

	@Autowired
	private ProductReviewFetchServiceImple productReviewFetchServiceImple;

	@Autowired
	private ProductReviewFetchAllServiceImple productReviewFetchAllServiceImple;

	@PostMapping("/saveProductReview")
	public ResponseEntity<ProductReview> saveProductReview(@RequestBody ProductReview productReview) {
		ProductReview e1 = productReviewSaveServiceImple.saveProductReviewData(productReview);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateProductReview/{prid}")
	public ResponseEntity<ProductReview> updateProductReview(@RequestBody ProductReview productReview, @PathVariable int prid) {
		ProductReview e1 = productReviewUpdateServiceImple.updateProductReviewData(productReview, prid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteProductReview/{prid}")
	public ResponseEntity<String> deleteProductReview(@PathVariable int prid) {
		productReviewDeleteServiceImple.deleteProductReviewData(prid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("ProductReview deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleProductReview/{prid}")
	public ResponseEntity<ProductReview> singleProductReviewData(@PathVariable int prid) {
		ProductReview e1 = productReviewFetchServiceImple.fetchProductReviewData(prid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllProductReviewData")
	public ResponseEntity<List<ProductReview>> allProductReviewData() {
		List<ProductReview> l1 = productReviewFetchAllServiceImple.fetchAllProductReviewData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}
