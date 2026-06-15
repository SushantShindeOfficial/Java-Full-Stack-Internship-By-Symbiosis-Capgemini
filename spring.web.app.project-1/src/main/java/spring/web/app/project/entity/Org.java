package spring.web.app.project.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Org {
	@Id
	private int id;
	private String name;
	@OneToMany
	private List<Dept> depts;
	public Org() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Org(int id, String name, List<Dept> depts) {
		super();
		this.id = id;
		this.name = name;
		this.depts = depts;
	}
	@Override
	public String toString() {
		return "Org [id=" + id + ", name=" + name + ", depts=" + depts + "]";
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
	public List<Dept> getDepts() {
		return depts;
	}
	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
}
