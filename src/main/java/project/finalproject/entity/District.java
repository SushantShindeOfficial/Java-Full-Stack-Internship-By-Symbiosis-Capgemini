package project.finalproject.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class District {
	@Id
	private int id;
	private String name;
	@OneToMany(targetEntity = Taluka.class)
	private List<Taluka> talukas;
	public District() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Taluka> getTalukas() {
		return talukas;
	}
	public void setTalukas(List<Taluka> talukas) {
		this.talukas = talukas;
	}
	@Override
	public String toString() {
		return "District [id=" + id + ", name=" + name + ", talukas=" + talukas + "]";
	}
	
	
}
