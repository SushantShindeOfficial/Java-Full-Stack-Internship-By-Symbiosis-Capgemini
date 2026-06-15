package project.finalproject.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Taluka {
	@Id
	 private int id;
     private String name;
     @OneToMany(targetEntity = Town.class)
     private List<Town> towns;
	 public Taluka() {
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
	 public List<Town> getTowns() {
		 return towns;
	 }
	 public void setTowns(List<Town> towns) {
		 this.towns = towns;
	 }
	 @Override
	 public String toString() {
		return "Taluka [id=" + id + ", name=" + name + ", towns=" + towns + "]";
	 }
     
     
}
