package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.Calculator;
import main.Validation;

/* Update calculator to change the add method to take two
 * Strings which can contain decimal to two places and 
 * returns a String.  Decimals more than two places should
 * throw an exception.
 * Update the calculator to change the subtract method to 
 * take two Strings which can contain decimals to two places
 * and returns a String.  Decimals more than two places
 * should throw an exception.
 * Update the calculator to add a multiply method which
 * takes two Strings which can contain two decimal places
 * and returns a String.  Decimals more than two places 
 * should throw an exception.
 * Update the calculator to add a divide method which
 * takes two Strings which can contain two decimal places
 * and returns a String.  Decimals more than two places
 * should throw an exception.  If the second value passed
 * in is zero, throw an exception.
 */
public class CalculatorTest {
	/* Instead of instatiating a new calculator for each
	 * test, can create a class variable to use
	 */
	
	private Calculator calculator;
	private Validation validation;
	
	@Before
	public void setUp() {
		validation = new Validation();
		calculator = new Calculator(validation);
	}
	@Test
	public void shouldReturnAnInstanceOfCalculator() {
		//Calculator calculator =  new Calculator();
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
		//Calculator calculator = new Calculator();
		String result = calculator.add("12.25", "13.52");
		Assert.assertEquals("25.77", result);
	}
	
	@Test
	public void shouldAddTwoNegativeDecimalsFromAString() {
		//Calculator calculator = new Calculator();
		String result = calculator.add("-12.25", "13.50");
		Assert.assertEquals("1.25", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenThreeDecimalPlacesPassed() {
		//Calculator calculator = new Calculator();
		calculator.add("1.11", "1.111");
	}
	
	@Test
	public void shouldSubtractTwoDecimalsFromAString() {
		//Calculator calculator = new Calculator();
		String result = calculator.subtract("14.75", "13.50");
		Assert.assertEquals("1.25", result);
	}
	
	@Test
	public void shouldSubtractTwoNegativeDecimalsFromAString() {
		//Calculator calculator = new Calculator();
		String result = calculator.subtract("-12.25", "13.50");
		Assert.assertEquals("-25.75", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenThreeDecimalPlacesPassedToSubtract() {
		//Calculator calculator = new Calculator();
		calculator.subtract("1.11", "1.111");
	}
	
	@Test
	public void shouldMultiplyTwoStrings() {
		String result = calculator.multiply("1.11", "1.11");
		Assert.assertEquals("1.2321", result);
		String result2 = calculator.multiply("100", "2.6");
		Assert.assertEquals("260.0", result2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionIfMultiplyingMoreThan2Decimals() {
		calculator.multiply("1.111", "2.2");	
	}
	
	@Test
	public void shouldDivideTwoStrings() {
		String result = calculator.divide("2.22", "1.11");
		Assert.assertEquals("2", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void divideShouldThrowExceptionForOver2DecimalPlaces() {
		calculator.divide("2.222", "1.1");
	}
	
	@Test(expected = IllegalArgumentException.class) 
		public void divideByZeroShouldThrowException() {
			calculator.divide("1.11", "0");
	}
	
	// This test isn't needed as it was tested above
	// for the add method
	@Test(expected = IllegalArgumentException.class)
	public void shouldCallValidateMethodForAdd() {
		calculator.add("1.111", "2.22");
	}
}
