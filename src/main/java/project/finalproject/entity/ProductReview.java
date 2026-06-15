package project.finalproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ProductReview {
	@Id
	private int prid;
	private String review;
	@OneToOne
	private Product product;
	public ProductReview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPrid() {
		return prid;
	}
	public void setPrid(int prid) {
		this.prid = prid;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "ProductReview [prid=" + prid + ", review=" + review + ", product=" + product + "]";
	}
	
	
	
}
