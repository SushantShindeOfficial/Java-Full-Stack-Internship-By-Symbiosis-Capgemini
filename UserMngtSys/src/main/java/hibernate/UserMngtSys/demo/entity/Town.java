package hibernate.UserMngtSys.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Town {
	@Id
	private int TownID;
	private String TownName;
	@ManyToOne
	private Taluka taluka;
	public Town() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Town [TownID=" + TownID + ", TownName=" + TownName + ", taluka=" + taluka + "]";
	}
	public int getTownID() {
		return TownID;
	}
	public void setTownID(int townID) {
		TownID = townID;
	}
	public String getTownName() {
		return TownName;
	}
	public void setTownName(String townName) {
		TownName = townName;
	}
	public Taluka getTaluka() {
		return taluka;
	}
	public void setTaluka(Taluka taluka) {
		this.taluka = taluka;
	}
}
