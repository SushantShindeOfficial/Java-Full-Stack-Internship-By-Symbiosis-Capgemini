package springboot.springboot.demo2.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer {
	private int customerId;
	private String customerName;
	private String city;
	private long mobile;

	// Purchased Products
	private List<Product> products;

	// Wishlist Categories
	private Set<String> wishlist;

	// Product Name → Rating
	private Map<String, Integer> ratings;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerName, String city, long mobile, List<Product> products,
			Set<String> wishlist, Map<String, Integer> ratings) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.city = city;
		this.mobile = mobile;
		this.products = products;
		this.wishlist = wishlist;
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", city=" + city + ", mobile="
				+ mobile + ", products=" + products + ", wishlist=" + wishlist + ", ratings=" + ratings + "]";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Set<String> getWishlist() {
		return wishlist;
	}

	public void setWishlist(Set<String> wishlist) {
		this.wishlist = wishlist;
	}

	public Map<String, Integer> getRatings() {
		return ratings;
	}

	public void setRatings(Map<String, Integer> ratings) {
		this.ratings = ratings;
	}
}
