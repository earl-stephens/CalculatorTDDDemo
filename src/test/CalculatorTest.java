package test;

import org.junit.Assert;
import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	
	@Test
	public void shouldReturnAnInstanceOfCalculator() {
		Calculator calculator =  new Calculator();
		Assert.assertNotNull(calculator);
	}
	
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
}
