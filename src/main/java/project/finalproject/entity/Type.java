package project.finalproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Type {
	@Id
	private int tid;
	private String name;
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Type [tid=" + tid + ", name=" + name + "]";
	}
	
	
}
