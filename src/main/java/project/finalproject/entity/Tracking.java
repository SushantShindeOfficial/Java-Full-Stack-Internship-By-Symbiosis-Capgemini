package project.finalproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tracking {
	@Id
	private int id;

	public Tracking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Tracking [id=" + id + "]";
	}
	
	
}
