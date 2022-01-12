package com.qa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BloopTest {

	@Test
	void bloop() {
		assertEquals(2, 1 + 1);
	}

	@Test
	void testFail() {
		assertEquals(3, 1 + 1);
	}
}
