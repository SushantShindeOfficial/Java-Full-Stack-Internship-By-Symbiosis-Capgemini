
package springboot.springboot.homework.demo2.entity;

import java.util.List;

public class Branch {
	private int branchId;
	private String name;

	private Address address;
	private Manager manager;

	private List<Dept> depts;

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Branch(int branchId, String name, Address address, Manager manager, List<Dept> depts) {
		super();
		this.branchId = branchId;
		this.name = name;
		this.address = address;
		this.manager = manager;
		this.depts = depts;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", name=" + name + ", address=" + address + ", manager=" + manager
				+ ", depts=" + depts + "]";
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public List<Dept> getDepts() {
		return depts;
	}

	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
}
