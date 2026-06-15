package springboot.springboot.demo3.entity4;

import java.util.List;

public class Org {
	private int regNo;
	private String name;
	private List<Address> address;
	private List<Dept> depts;
	private Ceo ceo;
	public Org() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Org(int regNo, String name, List<Address> address, List<Dept> depts, Ceo ceo) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.address = address;
		this.depts = depts;
		this.ceo = ceo;
	}
	@Override
	public String toString() {
		return "Org [regNo=" + regNo + ", name=" + name + ", address=" + address + ", depts=" + depts + ", ceo=" + ceo
				+ "]";
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public List<Dept> getDepts() {
		return depts;
	}
	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
	public Ceo getCeo() {
		return ceo;
	}
	public void setCeo(Ceo ceo) {
		this.ceo = ceo;
	}
}
