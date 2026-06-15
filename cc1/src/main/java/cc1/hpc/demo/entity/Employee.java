package cc1.hpc.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employeee")
public class Employee {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "price")
	private float price;
	@Column(name = "descc")
	private String desc;
	@Column(name = "category")
	private String category;

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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", price=" + price + ", desc=" + desc + ", category="
				+ category + "]";
	}

	public Employee(int id, String name, float price, String desc, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.desc = desc;
		this.category = category;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
