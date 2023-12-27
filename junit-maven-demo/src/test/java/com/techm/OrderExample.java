package com.techm;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class OrderExample {

	@Test
	@Order(1)
	void test1() {
		System.out.println("first");
	}

	@Test
	@Order(2)
	void test2() {
		System.out.println("second");
	}
	@Test
	@Order(3)
	void test3() {
		System.out.println("third");
	}



}
