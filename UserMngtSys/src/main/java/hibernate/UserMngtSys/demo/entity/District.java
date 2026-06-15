package hibernate.UserMngtSys.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class District {
	@Id
	private int DistID;
	private String DistrictName;
	private State state;
	@ManyToOne(targetEntity = Country.class)
	private Country country;
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public int getDistID() {
		return DistID;
	}
	public void setDistID(int distID) {
		DistID = distID;
	}
	public String getDistrictName() {
		return DistrictName;
	}
	public void setDistrictName(String districtName) {
		DistrictName = districtName;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "District [DistID=" + DistID + ", DistrictName=" + DistrictName + ", state=" + state + "]";
	}
	public District() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
