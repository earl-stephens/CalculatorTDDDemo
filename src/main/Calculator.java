package main;

public class Calculator {

	public String add(String first, String second) {
		double sum = Double.parseDouble(first) + Double.parseDouble(second);
		return String.format("%.2f", sum);
	}
	
	public String subtract(String first, String second) {
		double difference = Double.parseDouble(first) - Double.parseDouble(second);
		return String.format("%.2f", difference);
	}
}
