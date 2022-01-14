package main;

import java.math.BigDecimal;

public class Calculator {

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
		return firstValue.add(secondValue).toString();
	}
	
	public String subtract(String first, String second) {
		double difference = Double.parseDouble(first) - Double.parseDouble(second);
		return String.format("%.2f", difference);
	}
}
