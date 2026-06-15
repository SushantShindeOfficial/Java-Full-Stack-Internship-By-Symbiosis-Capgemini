package springboot.springboot.homework.demo.entity;

import java.util.List;

public class Dept {
	private int id;
	private String name;
	private String building;

	private List<Student> students;
	private List<Teacher> teachers;
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
		return "Dept [id=" + id + ", name=" + name + ", building=" + building + ", students=" + students + ", teachers="
				+ teachers + "]";
	}
	public Dept(int id, String name, String building, List<Student> students, List<Teacher> teachers) {
		super();
		this.id = id;
		this.name = name;
		this.building = building;
		this.students = students;
		this.teachers = teachers;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
