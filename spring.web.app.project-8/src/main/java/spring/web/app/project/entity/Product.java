package spring.web.app.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private int id;
	private String pname;
	private String pcity;
	private float price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String pname, String pcity, float price) {
		super();
		this.id = id;
		this.pname = pname;
		this.pcity = pcity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", pcity=" + pcity + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcity() {
		return pcity;
	}
	public void setPcity(String pcity) {
		this.pcity = pcity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
