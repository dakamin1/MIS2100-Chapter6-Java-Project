package Kamin.Derek.Chapter6.Java;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {
	
	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath math = new SimpleMath();
		
		assertEquals(0, math.divide(0, 7), .001);
	}
	
	@Test
	public void testThatSmallerNumeratorsReturnsDecimalValue() {
		SimpleMath math = new SimpleMath();
		
		assertEquals(.25, math.divide(1, 4), .001);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testThatZeroDenominatiorThrowsException() {
		SimpleMath math = new SimpleMath();
		
		assertEquals(.25, math.divide(6, 0), .001);
	}
	

}
