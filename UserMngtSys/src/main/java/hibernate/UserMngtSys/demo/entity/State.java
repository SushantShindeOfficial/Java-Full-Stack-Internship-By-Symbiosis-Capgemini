package hibernate.UserMngtSys.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State {
	@Id
	private int stateId;
	private String sateteName;
	private Country contry;
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getSateteName() {
		return sateteName;
	}
	public void setSateteName(String sateteName) {
		this.sateteName = sateteName;
	}
	public Country getContry() {
		return contry;
	}
	public void setContry(Country contry) {
		this.contry = contry;
	}
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", sateteName=" + sateteName + ", contry=" + contry + "]";
	}
	
}
