package hibernate.UserMngtSys.demo.entity;

import java.util.Date;
import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
	
	private int Personid;
	private String FullPersonName;
	private String PersonAddharNO;
	private String PersonStringPanNo;
	private String PersonEmail;
	private Date PersonDOB;
	private String PrsonMobNo;
//	@OneToMany(cascade = CascadeType.ALL)
	@OneToMany(targetEntity = Address.class)
	private List<Address> addresses;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [Personid=" + Personid + ", FullPersonName=" + FullPersonName + ", PersonAddharNO="
				+ PersonAddharNO + ", PersonStringPanNo=" + PersonStringPanNo + ", PersonEmail=" + PersonEmail
				+ ", PersonDOB=" + PersonDOB + ", PrsonMobNo=" + PrsonMobNo + ", addresses=" + addresses + "]";
	}
	public int getPersonid() {
		return Personid;
	}
	public void setPersonid(int personid) {
		Personid = personid;
	}
	public String getFullPersonName() {
		return FullPersonName;
	}
	public void setFullPersonName(String fullPersonName) {
		FullPersonName = fullPersonName;
	}
	public String getPersonAddharNO() {
		return PersonAddharNO;
	}
	public void setPersonAddharNO(String personAddharNO) {
		PersonAddharNO = personAddharNO;
	}
	public String getPersonStringPanNo() {
		return PersonStringPanNo;
	}
	public void setPersonStringPanNo(String personStringPanNo) {
		PersonStringPanNo = personStringPanNo;
	}
	public String getPersonEmail() {
		return PersonEmail;
	}
	public void setPersonEmail(String personEmail) {
		PersonEmail = personEmail;
	}
	public Date getPersonDOB() {
		return PersonDOB;
	}
	public void setPersonDOB(Date personDOB) {
		PersonDOB = personDOB;
	}
	public String getPrsonMobNo() {
		return PrsonMobNo;
	}
	public void setPrsonMobNo(String prsonMobNo) {
		PrsonMobNo = prsonMobNo;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
}
