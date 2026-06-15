package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Brand;
import project.finalproject.serviceimple.BrandSaveServiceImple;
import project.finalproject.serviceimple.BrandFetchServiceImple;
import project.finalproject.serviceimple.BrandFetchAllServiceImple;
import project.finalproject.serviceimple.BrandUpdateServiceImple;
import project.finalproject.serviceimple.BrandDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/brand")
public class BrandController {
	@Autowired
	private BrandSaveServiceImple brandSaveServiceImple;

	@Autowired
	private BrandUpdateServiceImple brandUpdateServiceImple;

	@Autowired
	private BrandDeleteServiceImple brandDeleteServiceImple;

	@Autowired
	private BrandFetchServiceImple brandFetchServiceImple;

	@Autowired
	private BrandFetchAllServiceImple brandFetchAllServiceImple;

	@PostMapping("/saveBrand")
	public ResponseEntity<Brand> saveBrand(@RequestBody Brand brand) {
		Brand e1 = brandSaveServiceImple.saveBrandData(brand);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateBrand/{bid}")
	public ResponseEntity<Brand> updateBrand(@RequestBody Brand brand, @PathVariable int bid) {
		Brand e1 = brandUpdateServiceImple.updateBrandData(brand, bid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteBrand/{bid}")
	public ResponseEntity<String> deleteBrand(@PathVariable int bid) {
		brandDeleteServiceImple.deleteBrandData(bid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("Brand deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleBrand/{bid}")
	public ResponseEntity<Brand> singleBrandData(@PathVariable int bid) {
		Brand e1 = brandFetchServiceImple.fetchBrandData(bid);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllBrandData")
	public ResponseEntity<List<Brand>> allBrandData() {
		List<Brand> l1 = brandFetchAllServiceImple.fetchAllBrandData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}
