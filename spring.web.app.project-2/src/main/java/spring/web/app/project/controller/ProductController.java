package spring.web.app.project.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.web.app.project.entity.Product;
import spring.web.app.project.repository.ProductRepository;

@RestController
@RequestMapping("/home")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/Product")
    public ResponseEntity<List<Product>> getdaEntity() {
    			
        List<Product> l1 = productRepository.findAll();

        return new ResponseEntity<List<Product>>(l1, HttpStatus.OK);
    }
}