package test;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.Validation;

/* Create a validate method which returns a
 * List<String> of errors and accepts a vargs
 * array of Strings - signature will be public
 * List<String> validate(String... values).
 * Write a unit test which returns an empty
 * list.
 */

public class ValidationTest {
	private Validation validation;
	
	@Before
	public void setUp() {
		validation = new Validation();
	}
	
	@Test
	public void shouldReturnAnInstanceOfValidation() {
		Validation validation = new Validation();
		Assert.assertNotNull(validation);
	}
	
	@Test
	public void shouldReturnAnEmptyListWhenNoErrorsPassedIn() {
		List<String> errors = validation.validate("1.11", "2.22");
		Assert.assertTrue(errors.isEmpty());
	}

}
