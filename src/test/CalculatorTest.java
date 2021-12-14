package test;

import org.junit.Assert;

import main.Calculator;

public class CalculatorTest {
	
	@Test
	public void shouldReturnAnInstanceOfCalculator() {
		Calculator calculator =  new Calculator();
		Assert.assertNotNull(calculator);
	}
}
