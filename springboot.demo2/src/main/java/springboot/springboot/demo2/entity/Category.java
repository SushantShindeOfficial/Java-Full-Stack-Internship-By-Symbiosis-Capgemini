package springboot.springboot.demo2.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Category {
	private int categoryId;
	private String categoryName;
	private String categoryType;

	// One Category → Many Products
	private List<Product> products;

	// Unique Brands
	private Set<String> brands;

	// Product Name → Quantity
	private Map<String, Integer> stock;

	public int getCategoryId() {
		return categoryId;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int categoryId, String categoryName, String categoryType, List<Product> products,
			Set<String> brands, Map<String, Integer> stock) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryType = categoryType;
		this.products = products;
		this.brands = brands;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryType="
				+ categoryType + ", products=" + products + ", brands=" + brands + ", stock=" + stock + "]";
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Set<String> getBrands() {
		return brands;
	}

	public void setBrands(Set<String> brands) {
		this.brands = brands;
	}

	public Map<String, Integer> getStock() {
		return stock;
	}

	public void setStock(Map<String, Integer> stock) {
		this.stock = stock;
	}
}
