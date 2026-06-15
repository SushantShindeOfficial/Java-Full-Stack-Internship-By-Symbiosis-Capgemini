package hp.java.hibernate.demo.entity;

import java.util.List;

public class Dept {
	 private int deptId;
	    public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Dept(int deptId, String name, String building, List<Student> students, List<Teacher> teachers) {
		super();
		this.deptId = deptId;
		this.name = name;
		this.building = building;
		this.students = students;
		this.teachers = teachers;
	}
		@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", name=" + name + ", building=" + building + ", students=" + students
				+ ", teachers=" + teachers + "]";
	}
		private String name;
	    private String building;
	    private List<Student> students;
	    public int getDeptId() {
			return deptId;
		}
		public void setDeptId(int deptId) {
			this.deptId = deptId;
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
		private List<Teacher> teachers;
}
