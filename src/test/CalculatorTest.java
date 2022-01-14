package test;

import org.junit.Assert;
import org.junit.Test;

import main.Calculator;

/* Update calculator to change the add method to take two
 * Strings which can contain decimal to two places and 
 * returns a String.  Decimals more than two places should
 * throw an exception.
 * Update the calculator to change the subtract method to 
 * take two Strings which can contain decimals to two places
 * and returns a String.  Decimals more than two places
 * should throw an exception.
 */
public class CalculatorTest {
	
	@Test
	public void shouldReturnAnInstanceOfCalculator() {
		Calculator calculator =  new Calculator();
		Assert.assertNotNull(calculator);
	}
	/*
	@Test
	public void shouldAddTwoIntegers() {
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 1);
		Assert.assertEquals(2, result);
	}
	
	@Test
	public void shouldAddTwoNegativeIntegers() {
		Calculator calculator = new Calculator();
		int result = calculator.add(-1, -1);
		Assert.assertEquals(-2, result);
	}
	
	@Test
	public void shouldSubtractTwoIntegers() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(5, 3);
		Assert.assertEquals(2, result);
	}
	
	@Test
	public void shouldSubtractTwoNegativeIntegers() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(5, -3);
		Assert.assertEquals(8, result);
	}
	*/
	
	@Test
	public void shouldAddTwoDecimalsFromAString() {
		Calculator calculator = new Calculator();
		String result = calculator.add("12.25", "13.52");
		Assert.assertEquals("25.77", result);
	}
	
	@Test
	public void shouldAddTwoNegativeDecimalsFromAString() {
		Calculator calculator = new Calculator();
		String result = calculator.add("-12.25", "13.50");
		Assert.assertEquals("1.25", result);
	}
	
	@Test
	public void shouldSubtractTwoDecimalsFromAString() {
		Calculator calculator = new Calculator();
		String result = calculator.subtract("14.75", "13.50");
		Assert.assertEquals("1.25", result);
	}
	
	@Test
	public void shouldSubtractTwoNegativeDecimalsFromAString() {
		Calculator calculator = new Calculator();
		String result = calculator.subtract("-12.25", "13.50");
		Assert.assertEquals("-25.75", result);
	}
}
