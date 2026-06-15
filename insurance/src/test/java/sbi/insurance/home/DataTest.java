package sbi.insurance.home;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class DataTest {
	Data d1=new Data();
	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("Executes on onece in LifeCycle in stating,metod should static");
	}
	@AfterClass
	public static void AfterClassTest() {
		System.out.println("Executes on onece in LifeCycle in Last,metod should static");
	}
	
	@Before
	public void display() {
		System.out.println("Before Every Test Case");
	}
	@After
	public void afterTest() {
		System.out.println("After Every Test Case ,either is pass or Fail");
	}
	
	@Test
	public void getDataTest() {
		int actual=100;
		int expected=d1.getData(500);
		System.out.println("This is Get Data Test Case");
		assertEquals(expected, actual);
	}
	@Test
	public void getStringTest() {
		String actual="Satara";
		String expected=d1.getString("Satar");
		System.out.println("This is Get String Test Case");
		assertEquals(expected, actual);
	}
	@Test
	@Ignore
	public void getfloatTest() {
		boolean actual=true;
		boolean expected=d1.getfloat(true);
		System.out.println("This is Get Float Test Case");
		assertEquals(expected, actual);
	}
}
