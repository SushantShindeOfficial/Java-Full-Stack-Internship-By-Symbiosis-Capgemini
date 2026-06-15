package springboot.springboot.homework.demo.entity;

import java.util.List;

public class College {
	private int id;
	private String name;
	private String city;

	private List<Dept> depts;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(int id, String name, String city, List<Dept> depts) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.depts = depts;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", city=" + city + ", depts=" + depts + "]";
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

	public List<Dept> getDepts() {
		return depts;
	}

	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
}
