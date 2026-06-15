package homework.collection.demo.entity;


import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empId;
	private String empName;

	public Employee(int empId, String empName) {

		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {

		return empId + " " + empName;
	}
}
