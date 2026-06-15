package edu.fuel.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeBusinessTest {

	@Test
	public void addEmployeeTest()
	{

		String  input="MCA";

		EmployeeBusinees e1=new EmployeeBusinees();
		String str=	e1.addEmployee();
		assertEquals(str, input);

	}
	public void updateEmployeeTest()
	{

	}
}
