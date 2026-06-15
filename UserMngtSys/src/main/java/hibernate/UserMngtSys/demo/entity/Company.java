package hibernate.UserMngtSys.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Company {
	@Id
	private int CompanyID;
	private String CompanyName;
	private String RegistrationNo;
	
	@OneToOne
	private Owner owner;
	
	@OneToMany(targetEntity = Manager.class)
	private List<Manager> managers;
	
	@OneToMany(targetEntity = Employee.class)
	private List<Employee> employees;
	
	@ManyToMany 
	private List<CompanyType> companyTypes; 
	@OneToMany(cascade = CascadeType.ALL) 
	private List<Address> addresses;
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Company [CompanyID=" + CompanyID + ", CompanyName=" + CompanyName + ", RegistrationNo=" + RegistrationNo
				+ ", owner=" + owner + ", managers=" + managers + ", employees=" + employees + ", departments="
				+ departments + ", companyTypes=" + companyTypes + ", addresses=" + addresses + "]";
	}
	@OneToMany(targetEntity = Department.class)
	private List<Department> departments;
	
	public int getCompanyID() {
		return CompanyID;
	}
	public void setCompanyID(int companyID) {
		CompanyID = companyID;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getRegistrationNo() {
		return RegistrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		RegistrationNo = registrationNo;
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
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	public List<CompanyType> getCompanyTypes() {
		return companyTypes;
	}
	public void setCompanyTypes(List<CompanyType> companyTypes) {
		this.companyTypes = companyTypes;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	
	
	
}
