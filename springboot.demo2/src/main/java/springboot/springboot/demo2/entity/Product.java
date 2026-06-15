package springboot.springboot.demo2.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Product {
	private int productId;
	private String productName;
	private String company;
	private double price;
	private int quantity;

	// Multiple Colors
	private List<String> colors;

	// Unique Sizes
	private Set<String> sizes;

	// Specification Key → Value
	private Map<String, String> specifications;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, String company, double price, int quantity, List<String> colors,
			Set<String> sizes, Map<String, String> specifications) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.company = company;
		this.price = price;
		this.quantity = quantity;
		this.colors = colors;
		this.sizes = sizes;
		this.specifications = specifications;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", company=" + company + ", price="
				+ price + ", quantity=" + quantity + ", colors=" + colors + ", sizes=" + sizes + ", specifications="
				+ specifications + "]";
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public Set<String> getSizes() {
		return sizes;
	}

	public void setSizes(Set<String> sizes) {
		this.sizes = sizes;
	}

	public Map<String, String> getSpecifications() {
		return specifications;
	}

	public void setSpecifications(Map<String, String> specifications) {
		this.specifications = specifications;
	}
}
