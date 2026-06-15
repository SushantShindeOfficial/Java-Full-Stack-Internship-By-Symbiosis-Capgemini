package project.finalproject.factory;

import project.finalproject.entity.Product;

public class ProductFactory {
	public static Product createProduct() {
		return new Product();
	}
}
