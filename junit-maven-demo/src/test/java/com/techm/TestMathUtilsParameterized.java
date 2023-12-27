package com.techm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class TestMathUtilsParameterized {
	@ParameterizedTest
	// @CsvSource({"10,2,5","12,4,3","8,2,4"})
	//@CsvFileSource(resources = "/myfile.csv")
	// @ValueSource(ints = {10,2,5,12,4,3})
	 @MethodSource("dataProvider")
   //@Disabled
  
	void testDivide(int dividend, int divisor, int expectedQuotient) {

		int result = MathUtils.divide(dividend, divisor);

		assertEquals(expectedQuotient, result, () -> "unexpected result for divide operation");
		
		System.out.println("executed in second place");
	}

	static Stream<Arguments> dataProvider() {
		return Stream.of(Arguments.of(10, 2, 5), Arguments.of(12, 4, 3), Arguments.of(8, 2, 4));
	}

	@ParameterizedTest
	 @ValueSource(strings = {"rk","abc","xyz"})
   
	
	void testValueSource(String x) {
		System.out.println(x);
		System.out.println("executed in third place");
	}
	
	
	//@RepeatedTest(5)
	
	@Test
	void myTest()
	{
		
		System.out.println("first executed");
	 int result= 2+2;
	 assertEquals(4, result);
	 
	}
	
	

}
