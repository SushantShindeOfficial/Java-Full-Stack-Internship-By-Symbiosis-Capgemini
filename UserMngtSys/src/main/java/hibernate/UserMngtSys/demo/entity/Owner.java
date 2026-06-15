package hibernate.UserMngtSys.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Owner {
	@Id
	private int OwnerID;
	private String OwnerFullName;
	private String OwnerAadhar;
	private String OwnerEmail;
	private String OwnerPan;
	private String ownerMobNo;
	private Date OwnerDOB;
	private double OwnerAnnualIncome;
	private String OwnerExperience;
	@ManyToOne
	private Role role;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> addresses;
	
	@OneToOne(mappedBy = "owner")
	private Company company;

	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Owner [OwnerID=" + OwnerID + ", OwnerFullName=" + OwnerFullName + ", OwnerAadhar=" + OwnerAadhar
				+ ", OwnerEmail=" + OwnerEmail + ", OwnerPan=" + OwnerPan + ", ownerMobNo=" + ownerMobNo + ", OwnerDOB="
				+ OwnerDOB + ", OwnerAnnualIncome=" + OwnerAnnualIncome + ", OwnerExperience=" + OwnerExperience
				+ ", role=" + role + ", addresses=" + addresses + ", company=" + company + "]";
	}

	public int getOwnerID() {
		return OwnerID;
	}

	public void setOwnerID(int ownerID) {
		OwnerID = ownerID;
	}

	public String getOwnerFullName() {
		return OwnerFullName;
	}

	public void setOwnerFullName(String ownerFullName) {
		OwnerFullName = ownerFullName;
	}

	public String getOwnerAadhar() {
		return OwnerAadhar;
	}

	public void setOwnerAadhar(String ownerAadhar) {
		OwnerAadhar = ownerAadhar;
	}

	public String getOwnerEmail() {
		return OwnerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		OwnerEmail = ownerEmail;
	}

	public String getOwnerPan() {
		return OwnerPan;
	}

	public void setOwnerPan(String ownerPan) {
		OwnerPan = ownerPan;
	}

	public String getOwnerMobNo() {
		return ownerMobNo;
	}

	public void setOwnerMobNo(String ownerMobNo) {
		this.ownerMobNo = ownerMobNo;
	}

	public Date getOwnerDOB() {
		return OwnerDOB;
	}

	public void setOwnerDOB(Date ownerDOB) {
		OwnerDOB = ownerDOB;
	}

	public double getOwnerAnnualIncome() {
		return OwnerAnnualIncome;
	}

	public void setOwnerAnnualIncome(double ownerAnnualIncome) {
		OwnerAnnualIncome = ownerAnnualIncome;
	}

	public String getOwnerExperience() {
		return OwnerExperience;
	}

	public void setOwnerExperience(String ownerExperience) {
		OwnerExperience = ownerExperience;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
}
