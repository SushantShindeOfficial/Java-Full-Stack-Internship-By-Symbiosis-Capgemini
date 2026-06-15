package hp.java.hibernate.demo.entity;

public class Student {
	private int studentId;
    private String name;
    private String city;
    public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String name, String city, float per) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.city = city;
		this.per = per;
	}
	public Student(String city) {
		super();
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", city=" + city + ", per=" + per + "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private float per; // Assumed to mean 'percentage'
}
