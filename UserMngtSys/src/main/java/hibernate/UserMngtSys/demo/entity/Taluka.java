package hibernate.UserMngtSys.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Taluka {
	@Id
	private int TalukaID;
	private String TalukaName;

	@ManyToOne(targetEntity = District.class)
	private District district;

	public int getTalukaID() {
		return TalukaID;
	}

	public Taluka() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Taluka [TalukaID=" + TalukaID + ", TalukaName=" + TalukaName + ", district=" + district + "]";
	}

	public void setTalukaID(int talukaID) {
		TalukaID = talukaID;
	}

	public String getTalukaName() {
		return TalukaName;
	}

	public void setTalukaName(String talukaName) {
		TalukaName = talukaName;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

}
