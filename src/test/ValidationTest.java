package test;

import org.junit.Assert;
import org.junit.Test;

import main.Validation;

public class ValidationTest {
	
	@Test
	public void shouldReturnAnInstanceOfValidation() {
		Validation validation = new Validation();
		Assert.assertNotNull(validation);
	}

}
