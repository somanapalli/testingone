package com.techm;

public class MathUtils {
	public static int divide(int dividend,int divisor) {
		
		if(divisor==0) {
			throw new ArithmeticException("cannot divide by zero");
		}
		return dividend/divisor;
		
	}

}
