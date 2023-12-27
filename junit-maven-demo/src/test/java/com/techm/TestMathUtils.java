package com.techm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMathUtils {

	@Test
	void testDivideByZero() {
		
		assertThrows(ArithmeticException.class,()->{
			
			MathUtils.divide(10, 0);
		});
	}
	
	@Test
	public void testDivide()
	{
		int result = MathUtils.divide(10,2);
		assertEquals(5, result);
	}

}
