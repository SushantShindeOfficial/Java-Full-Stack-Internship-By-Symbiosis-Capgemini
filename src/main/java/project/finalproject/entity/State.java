package project.finalproject.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class State {
	@Id
	private int id;
	private String name;
	@OneToMany(targetEntity = District.class)
	private List<District> districts;
	public State() {
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
	public List<District> getDistricts() {
		return districts;
	}
	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}
	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + ", districts=" + districts + "]";
	}
	
	
}
