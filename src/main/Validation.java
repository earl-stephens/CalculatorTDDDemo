package main;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class Validation {
	public List<String> validate(String... values) {
		BigDecimal firstValue = new BigDecimal(values[0]);
		if(firstValue.scale() > 2) {
			throw new IllegalArgumentException("Too many decimal places for value " + values[0]);
		}
		return Collections.EMPTY_LIST;
	}

}
