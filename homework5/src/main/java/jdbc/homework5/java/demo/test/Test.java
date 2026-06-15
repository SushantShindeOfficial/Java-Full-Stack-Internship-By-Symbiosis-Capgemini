package jdbc.homework5.java.demo.test;

import jdbc.homework5.java.demo.entity.Product;
import jdbc.homework5jdbc.homework5.java.demo.service.CreateService;
import jdbc.homework5jdbc.homework5.java.demo.service.DeleteService;
import jdbc.homework5jdbc.homework5.java.demo.service.FetchService;
import jdbc.homework5jdbc.homework5.java.demo.service.UpdateService;
import jdbc.homework5jdbc.homework5.java.demo.servieImple.CreateServiceImpl;
import jdbc.homework5jdbc.homework5.java.demo.servieImple.DeleteServiceImpl;
import jdbc.homework5jdbc.homework5.java.demo.servieImple.FetchServiceImpl;
import jdbc.homework5jdbc.homework5.java.demo.servieImple.UpdateServiceImpl;

public class Test {

	public static void main(String[] args) {

		Product p = new Product(1, "Laptop", 50000, "Gaming", "Electronics");

		CreateService cs = new CreateServiceImpl();

		cs.createProduct(p);

		UpdateService us = new UpdateServiceImpl();

		us.updateProductPrice(1, 65000);

		FetchService fs = new FetchServiceImpl();

		fs.fetchProducts();

		DeleteService ds = new DeleteServiceImpl();

		ds.deleteProduct(1);
	}
}
