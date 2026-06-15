package sbi.insurance.calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	Calculator c1 = new Calculator();

	@Test
	public void addTest() {
		int expected = 97;
		int actual = c1.add(75, 22);
		assertEquals(expected, actual);
	}

	@Test
	public void subTest() {
		int expected = 53;
		int actual = c1.sub(75, 22);
		assertEquals(expected, actual);
	}

	@Test
	public void mulTest() {
		int expected = 1650;
		int actual = c1.mul(75, 22);
		assertEquals(expected, actual);
	}

	@Test
	public void divTest() {
		float expected = 75.4f / 22.3f;
		float actual = c1.div(75.4f, 22.3f);
		assertEquals(expected, actual, 0.01f); // delta for float
	}
}