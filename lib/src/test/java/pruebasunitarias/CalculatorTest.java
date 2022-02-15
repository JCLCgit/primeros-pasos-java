package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private final Calculator calculadora =new Calculator();
	
	@Test
	void addition() {
		assertEquals(8, calculadora.addNumbers(5,3));
	}
	
	@Test
	void substract() {
		assertEquals(0, calculadora.subtractNumbers(10, 10));
	}
	@Test
	void division() {
		assertEquals(5, calculadora.divideNumbers(25, 5));	
	}
	
	@Test
	void multiply() {
		assertEquals(5, calculadora.multiplyNumbers(5,1));
	}
}
