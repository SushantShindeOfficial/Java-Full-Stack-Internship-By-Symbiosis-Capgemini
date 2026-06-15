package springboot.springboot.demo3.entity4;

import java.util.List;

public class Dept {
	private int did;
	private String deptName;
	
	List<Employee> employees;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Dept [did=" + did + ", deptName=" + deptName + ", employees=" + employees + "]";
	}

	public Dept(int did, String deptName, List<Employee> employees) {
		super();
		this.did = did;
		this.deptName = deptName;
		this.employees = employees;
	}

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
