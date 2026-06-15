package springboot.springboot.demo2.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supplier {
	private int supplierId;
	private String supplierName;
	private String city;
	private long contact;

	// One Supplier supplies many products
	private List<Product> products;

	// Unique Countries
	private Set<String> countries;

	// Product Name → Delivery Days
	private Map<String, Integer> deliveryTime;

	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Supplier(int supplierId, String supplierName, String city, long contact, List<Product> products,
			Set<String> countries, Map<String, Integer> deliveryTime) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.city = city;
		this.contact = contact;
		this.products = products;
		this.countries = countries;
		this.deliveryTime = deliveryTime;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", city=" + city + ", contact="
				+ contact + ", products=" + products + ", countries=" + countries + ", deliveryTime=" + deliveryTime
				+ "]";
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Set<String> getCountries() {
		return countries;
	}

	public void setCountries(Set<String> countries) {
		this.countries = countries;
	}

	public Map<String, Integer> getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Map<String, Integer> deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
}
