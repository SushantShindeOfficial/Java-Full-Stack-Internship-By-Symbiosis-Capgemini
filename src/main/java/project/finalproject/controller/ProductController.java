package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Product;
import project.finalproject.serviceimple.ProductSaveServiceImple;
import project.finalproject.serviceimple.ProductFetchServiceImple;
import project.finalproject.serviceimple.ProductFetchAllServiceImple;
import project.finalproject.serviceimple.ProductUpdateServiceImple;
import project.finalproject.serviceimple.ProductDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductSaveServiceImple productSaveServiceImple;

	@Autowired
	private ProductUpdateServiceImple productUpdateServiceImple;

	@Autowired
	private ProductDeleteServiceImple productDeleteServiceImple;

	@Autowired
	private ProductFetchServiceImple productFetchServiceImple;

	@Autowired
	private ProductFetchAllServiceImple productFetchAllServiceImple;

	@PostMapping("/saveProduct")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		Product e1 = productSaveServiceImple.saveProductData(product);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateProduct/{pid}")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable int pid) {
		Product e1 = productUpdateServiceImple.updateProductData(product, pid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteProduct/{pid}")
	public ResponseEntity<String> deleteProduct(@PathVariable int pid) {
		productDeleteServiceImple.deleteProductData(pid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("Product deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleProduct/{pid}")
	public ResponseEntity<Product> singleProductData(@PathVariable int pid) {
		Product e1 = productFetchServiceImple.fetchProductData(pid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllProductData")
	public ResponseEntity<List<Product>> allProductData() {
		List<Product> l1 = productFetchAllServiceImple.fetchAllProductData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}
