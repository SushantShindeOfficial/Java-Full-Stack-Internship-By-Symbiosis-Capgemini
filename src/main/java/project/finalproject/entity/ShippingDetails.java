package project.finalproject.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class ShippingDetails {
	@Id
	private int sid;
	@ManyToMany(targetEntity = User.class)
	private Set<User> users;
	public ShippingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "ShippingDetails [sid=" + sid + ", users=" + users + "]";
	}
	
	

}
