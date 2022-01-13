package com.qa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.peer.Factorial;

public class FactorialTest {

	private Factorial fact = new Factorial();

	@Test
	void test1Factorial() {
		assertEquals("1!", fact.reverseFactorial(1));
	}

	@Test
	void test2Factorial() {
		assertEquals("2!", fact.reverseFactorial(2));
	}

	@Test
	void test3Factorial() {
		assertEquals("3!", fact.reverseFactorial(6));
	}

	@Test
	void test4Factorial() {
		assertEquals("4!", fact.reverseFactorial(24));
	}

	@Test
	void test5Factorial() {
		assertEquals("5!", fact.reverseFactorial(120));
	}

	@Test
	void testNoneFactorial() {
		assertEquals("NONE!", fact.reverseFactorial(99));
	}

	@Test
	void testMinusFactorial() {
		assertEquals("NONE!", fact.reverseFactorial(-1));
	}
}
