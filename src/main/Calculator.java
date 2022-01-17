package main;

import java.math.BigDecimal;

public class Calculator {
	
	public Calculator() {
		Validation validator = new Validation();
	}

	public String add(String first, String second) {
		//	double sum = Double.parseDouble(first) + Double.parseDouble(second);
		//	return String.format("%.2f", sum);
		// alternative to the above
		//	return new BigDecimal(first).add(new BigDecimal(second)).toString();
			
		//refactor for adding in exception
		BigDecimal firstValue = new BigDecimal(first);	
		BigDecimal secondValue = new BigDecimal(second);	
		
		if(firstValue.scale() > 2 || secondValue.scale() > 2) {
			throw new IllegalArgumentException("Too many decimal places.");
		}
		
		validator.validate(first, second);
		return firstValue.add(secondValue).toString();
	}
	
	public String subtract(String first, String second) {
		BigDecimal firstValue = new BigDecimal(first);
		BigDecimal secondValue = new BigDecimal(second);
		
		if(firstValue.scale() > 2 || secondValue.scale() > 2) {
			throw new IllegalArgumentException("Too many decimal places.");
		}
		
		return firstValue.subtract(secondValue).toString();
	}
	
	public String multiply(String first, String second) {
		BigDecimal firstValue = new BigDecimal(first);
		BigDecimal secondValue = new BigDecimal(second);
		
		if(firstValue.scale() > 2 || secondValue.scale() > 2) {
			throw new IllegalArgumentException("Too many decimal places.");
		}
		
		return firstValue.multiply(secondValue).toString();
	}
	
	public String divide(String first, String second) {
		BigDecimal firstValue = new BigDecimal(first);
		BigDecimal secondValue = new BigDecimal(second);
		
		if(secondValue.intValue() == 0) {
			throw new IllegalArgumentException("Cannot divide by zero.");
		}
		
		if(firstValue.scale() > 2 || secondValue.scale() > 2) {
			throw new IllegalArgumentException("Too many decimal places.");
		}
		
		return firstValue.divide(secondValue).toString();
	}
}
