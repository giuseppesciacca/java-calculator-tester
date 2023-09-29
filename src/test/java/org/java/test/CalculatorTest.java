package org.java.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calculator;

	@BeforeEach
	public void beforeEach() {
		calculator = new Calculator();

	}

	@Test
	@DisplayName("Test add operation")
	public void addOperation() {

		assertEquals(10, calculator.add(7, 3));
	}
}
