package hibernate.hibernate.mapping.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int regno;

	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "company_address_fk")
	private List<Address> address;

	@OneToOne(cascade = CascadeType.ALL)
	private Owner owner;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "company_branch_fk")
	private List<Branch> branches;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Company [regno=" + regno + ", name=" + name + ", branches=" + branches + ", address=" + address
				+ ", owner=" + owner + "]";
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address2) {
		this.address = address2;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
