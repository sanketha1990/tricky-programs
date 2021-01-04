package com.tricky.programmer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestException {
	
	static void doStuff() throws Exception {
		throw new NullPointerException();
	}
	static void arithmeticExeception() throws Exception{
		throw new ArithmeticException();
	}
	@Test
	void isNullPointer() {
		Throwable exception = assertThrows(NullPointerException.class, () ->TestException.doStuff());
	    assertEquals(null, exception.getMessage());
	}
	
	@Test
	void arithmeticExecptio() {
		Throwable exception=assertThrows(ArithmeticException.class, ()->TestException.arithmeticExeception());
		assertEquals(null, exception.getMessage());
	}

}
