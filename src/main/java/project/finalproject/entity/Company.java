package project.finalproject.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Company {
	@Id
	private int regNo;
	private String name;
	@OneToMany(targetEntity = Address.class)
	private List<Address> address;
	@OneToOne
	private Owner owner;
	@OneToMany(targetEntity = Manager.class)
	private List<Manager> managers;
	@OneToMany(targetEntity = Admin.class)
	private List<Admin> admins;
	@OneToMany(targetEntity = Employee.class)
	private List<Employee> employees;
	@OneToMany(targetEntity = Dept.class)
	private List<Dept> depts;
	@OneToMany(targetEntity = Type.class)
	private List<Type> types;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
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
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public List<Manager> getManagers() {
		return managers;
	}
	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}
	public List<Admin> getAdmins() {
		return admins;
	}
	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public List<Dept> getDepts() {
		return depts;
	}
	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
	public List<Type> getTypes() {
		return types;
	}
	public void setTypes(List<Type> types) {
		this.types = types;
	}
	@Override
	public String toString() {
		return "Company [regNo=" + regNo + ", name=" + name + ", address=" + address + ", owner=" + owner
				+ ", managers=" + managers + ", admins=" + admins + ", employees=" + employees + ", depts=" + depts
				+ ", types=" + types + "]";
	}
	
	
}
