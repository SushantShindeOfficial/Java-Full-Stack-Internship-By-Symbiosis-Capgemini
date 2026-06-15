package hibernate.hibernate.manytomany.entity;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Teacher {
	@Id
	private int id;
	private String name;
	private String dept;
	private float salary;
	@ManyToMany(targetEntity = Subject.class)
	private Set subjects;
	
	public void setSubjects(Set subjects) {
		this.subjects = subjects;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", subjects="
				+ subjects + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Set<Subject> getSubjects() {
		return subjects;
	}
//	public void setSubjects(Set<Subject> subjects) {
//		this.subjects = subjects;
//	}
}
