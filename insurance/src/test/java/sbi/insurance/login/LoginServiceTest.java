package sbi.insurance.login;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class LoginServiceTest {
	LoginService l1=new LoginService();
	@Test
	public void LoginServiceTest() {
		
		String actual="Pune";//input
		String expected= l1.getLogin();//database User
		
		assertEquals(expected,actual);
		
	}
	
	public void getPasswardTest() {
		
		
	}
}
