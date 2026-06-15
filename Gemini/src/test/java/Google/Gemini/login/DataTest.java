package Google.Gemini.login;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class DataTest {
	
	Data d1 = new Data();
	@RepeatedTest(value = 5)
	@DisplayName(value = "Sushant")
	public void displayTest() {
		String abc ="Java";
		String def = d1.display();//"java";
		
		assertEquals(def,abc);
	}
	
	
}
