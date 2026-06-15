package hibernate.hibernate.manytomany.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subject {
	@Id
	private int Subid;
	private String name;
	private String Author;
	@ManyToMany(targetEntity = Teacher.class)
	private Set teachers;
	
	public void setTeachers(Set teachers) {
		this.teachers = teachers;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Subject [Subid=" + Subid + ", name=" + name + ", Author=" + Author + ", teachers=" + teachers + "]";
	}
	public int getSubid() {
		return Subid;
	}
	public void setSubid(int subid) {
		Subid = subid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public Set<Teacher> getTeachers() {
		return teachers;
	}
//	public void setTeachers(Set<Teacher> teachers) {
//		this.teachers = teachers;
//	}
}
