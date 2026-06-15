package homework.collection.demo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int deptId;
	private String deptName;

	List<Employee> empList = new ArrayList<Employee>();

	public Department(int deptId, String deptName) {

		this.deptId = deptId;
		this.deptName = deptName;
	}

	public void addEmployee(Employee e) {

		empList.add(e);
	}

	@Override
	public String toString() {

		return deptId + " " + deptName + " " + empList;
	}
}