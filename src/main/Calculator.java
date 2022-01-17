package main;

import java.math.BigDecimal;
import java.util.List;

public class Calculator {
	
	private Validation validation;
	
	public Calculator(Validation validation) {
		this.validation = validation;
	}

	public String add(String first, String second) {
		//	double sum = Double.parseDouble(first) + Double.parseDouble(second);
		//	return String.format("%.2f", sum);
		// alternative to the above
		//	return new BigDecimal(first).add(new BigDecimal(second)).toString();
			
		//refactor for adding in exception
		/*

		
		if(firstValue.scale() > 2 || secondValue.scale() > 2) {
			throw new IllegalArgumentException("Too many decimal places.");
		}
		*/
		
		List<String> errors = this.validation.validate(first, second);
		
		if(!errors.isEmpty()) {
			throw new IllegalArgumentException(errors.toString());
		}
		//BigDecimal firstValue = new BigDecimal(first);	
		//BigDecimal secondValue = new BigDecimal(second);	
		return new BigDecimal(first).add(new BigDecimal(second)).toString();
	}
	
	public String subtract(String first, String second) {
		/*
		BigDecimal firstValue = new BigDecimal(first);
		BigDecimal secondValue = new BigDecimal(second);
		
		if(firstValue.scale() > 2 || secondValue.scale() > 2) {
			throw new IllegalArgumentException("Too many decimal places.");
		}
		
		return firstValue.subtract(secondValue).toString();
		*/
		/* replace below with new method
		List<String> errors = this.validation.validate(first, second);
		if(!errors.isEmpty()) {
			throw new IllegalArgumentException(errors.toString());
		}
		*/
		validateDecimals(first, second);
		return new BigDecimal(first).subtract(new BigDecimal(second)).toString();
	}
	
	public String multiply(String first, String second) {
		validateDecimals(first, second);
		return new BigDecimal(first).multiply(new BigDecimal(second)).toString();
	}
	
	public String divide(String first, String second) {
		if(new BigDecimal(second).intValue() == 0) {
			throw new IllegalArgumentException("Cannot divide by zero.");
		}
		validateDecimals(first, second);
		return new BigDecimal(first).divide(new BigDecimal(second)).toString();
	}
	
	private void validateDecimals(String... values) {
		List<String> errors = this.validation.validate(values);
		if(!errors.isEmpty()) {
			throw new IllegalArgumentException(errors.toString());
		}
	}

}
