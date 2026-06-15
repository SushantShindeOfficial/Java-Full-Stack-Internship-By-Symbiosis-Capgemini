package hp.java.hibernate.demo.entity;

import java.util.List;

public class College {
	 private int collegeId;
	    public College(int collegeId, String name, String city, List<Dept> depts) {
		super();
		this.collegeId = collegeId;
		this.name = name;
		this.city = city;
		this.depts = depts;
	}
		public College() {
		super();
		// TODO Auto-generated constructor stub
	}
		@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", name=" + name + ", city=" + city + ", depts=" + depts + "]";
	}
		public int getCollegeId() {
		return collegeId;
	}
	 public void setCollegeId(int collegeId) {
		 this.collegeId = collegeId;
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
		private String name;
	    private String city;
	    private List<Dept> depts;
}
