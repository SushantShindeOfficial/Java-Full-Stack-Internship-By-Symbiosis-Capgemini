package spring.web.app.project.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class College {
	@Id
	private int id;
	private String name;
	private String city;

	@OneToMany(mappedBy = "college")
	private List<Student> students;

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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", city=" + city + ", students=" + students + "]";
	}

	public College(int id, String name, String city, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.students = students;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
