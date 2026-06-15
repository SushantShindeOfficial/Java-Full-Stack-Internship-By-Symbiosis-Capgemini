package springboot.springboot.homework.demo2.entity;

import java.util.List;

public class Company {
	private int regno;
	private String name;

	private List<Branch> branches;
	private List<Address> address;

	private Owner owner;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(int regno, String name, List<Branch> branches, List<Address> address, Owner owner) {
		super();
		this.regno = regno;
		this.name = name;
		this.branches = branches;
		this.address = address;
		this.owner = owner;
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

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}
