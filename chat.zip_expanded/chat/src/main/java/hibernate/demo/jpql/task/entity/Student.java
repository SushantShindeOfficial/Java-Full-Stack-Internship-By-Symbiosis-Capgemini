package hibernate.demo.jpql.task.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int sid;
	private String sname;

	@ManyToMany
	private List<Course> courses;

	public Student() {
		super();
	}

	public Student(int sid, String sname, List<Course> courses) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.courses = courses;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}


