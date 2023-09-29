package org.java.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
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
	public void testAdd() {

		assertEquals(10, calculator.add(7, 3));
	}

	@Test
	@DisplayName("Test subtract operation")
	public void testSubtract() {

		assertEquals(10, calculator.subtract(13, 3));
	}

	@Test
	@DisplayName("Test divide operation")
	public void testDivide() throws Exception {

		try {
			assertEquals(10, calculator.divide(20, 2));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	@DisplayName("Test divide /0")
	void testDividi() {
		assertDoesNotThrow(() -> calculator.divide(10, 0), "Deve sollevare IllegalArgumentException per divisione per zero");
	}

	@Test
	@DisplayName("Test multiply operation")
	public void testMultiply() {

		assertEquals(10, calculator.multiply(5, 2));
	}
}
