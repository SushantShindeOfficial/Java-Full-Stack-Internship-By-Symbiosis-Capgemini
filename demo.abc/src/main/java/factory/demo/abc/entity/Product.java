package factory.demo.abc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int id;
	private String name;
	private float prize;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, float prize) {
		super();
		this.id = id;
		this.name = name;
		this.prize = prize;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", prize=" + prize + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrize() {
		return prize;
	}
	public void setPrize(float prize) {
		this.prize = prize;
	}
}
