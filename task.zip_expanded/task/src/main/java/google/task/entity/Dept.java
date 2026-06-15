package google.task.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "tblDept")
public class Dept {
	@Id
	private int did;
	private String name;
	private String building;
	@OneToMany(targetEntity = Student.class)
	private List<Student> students;
	@OneToMany(targetEntity = Teacher.class)
	private List<Teacher> teachers;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", name=" + name + ", building=" + building + ", students=" + students
				+ ", teachers=" + teachers + "]";
	}
	

}
