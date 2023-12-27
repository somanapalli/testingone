package com.techm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestApp {

	@Test
	public void testWelcome() {
		App obj = new App();
		String result = obj.welcome("rk");
		assertEquals("welcome,rk", result,()->"something wrong in expected");
	}

}
