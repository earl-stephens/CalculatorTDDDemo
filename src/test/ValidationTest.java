package test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.Validation;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/* Create a validate method which returns a
 * List<String> of errors and accepts a vargs
 * array of Strings - signature will be public
 * List<String> validate(String... values).
 * Write a unit test which returns an empty
 * list.
 * 
 * Using TDD, pass a single String with decimal value
 * 1.111 in to the validate method.  Assert that a 
 * List<String> of size 1 is returned containing the message
 * 'Too many decimal places for value 1.111'
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
	
	@Test
	public void shouldReturnAnErrorForTooManyDecimalPlaces() {
		List<String> errors = validation.validate("1.111");
		//List<String> expected = Arrays.asList("Too many decimal places for value 1.11");
		//assertThat(errors, is(expected));
		Assert.assertEquals(1,  errors.size());
		Assert.assertEquals("Too many decimal places for value 1.111", errors.get(0));
	}

}
