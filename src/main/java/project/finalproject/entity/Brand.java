package project.finalproject.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Brand {
	@Id
	private int bid;
	private String name;
	@OneToMany(targetEntity = Product.class)
	private List<Product> products;
	@OneToMany(targetEntity = Category.class)
	private List<Category> categories;
	@OneToMany(targetEntity = SubCategory.class)
	private List<SubCategory> subCategories;
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public List<SubCategory> getSubCategories() {
		return subCategories;
	}
	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}
	@Override
	public String toString() {
		return "Brand [bid=" + bid + ", name=" + name + ", products=" + products + ", categories=" + categories
				+ ", subCategories=" + subCategories + "]";
	}
	
	
	
}
