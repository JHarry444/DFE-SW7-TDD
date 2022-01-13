package com.qa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.peer.Doggo;

public class DoggoTest {

	private Doggo doggo = new Doggo();

	@Test
	void testLength() {
		assertEquals(99, this.doggo.competition(4).size());
	}

	@Test
	void testNotContains() {
		assertEquals(false, this.doggo.competition(5).contains("5th"));
	}

	@Test
	void testOutOfRange() {
		assertEquals(false, this.doggo.competition(6).contains("101st"));
	}

	@Test
	void testEleventh() {
		assertEquals(true, this.doggo.competition(4).contains("11th"));
	}

	@Test
	void testTwelth() {
		assertEquals(true, this.doggo.competition(4).contains("12th"));
	}

	@Test
	void testThirteenth() {
		assertEquals(true, this.doggo.competition(4).contains("13th"));
	}

	@Test
	void testTwentyFirst() {
		assertEquals(true, this.doggo.competition(4).contains("21st"));
	}

	@Test
	void testThirtySecond() {
		assertEquals(true, this.doggo.competition(4).contains("32nd"));
	}

	@Test
	void testFirtyThird() {
		assertEquals(true, this.doggo.competition(4).contains("43rd"));
	}
}
