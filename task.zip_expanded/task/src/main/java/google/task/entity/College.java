package google.task.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tblCollege")
public class College {
	@Id
	private int id;
	private String name;
	private String city;
	@OneToOne
	private Principal principal;
	@OneToMany(targetEntity = Dept.class)
	List<Dept> depts;
	public College() {
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public List<Dept> getDepts() {
		return depts;
	}
	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", city=" + city + ", principal=" + principal + ", depts="
				+ depts + "]";
	}
	
	

}
