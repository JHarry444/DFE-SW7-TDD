package com.qa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.blackjack.BlackJack;

public class BlackJackTest {

	private BlackJack jack = new BlackJack();

	@Test
	void testBothBust() {
		assertEquals(0, jack.play(22, 22));
	}

	@Test
	void testDraw() {
		assertEquals(20, jack.play(20, 20));
	}

	@Test
	void testP1Bust() {
		assertEquals(7, jack.play(22, 7));
	}

	@Test
	void testP2Bust() {
		assertEquals(11, jack.play(11, 22));
	}

	@Test
	void testP1Wins() {
		assertEquals(20, jack.play(20, 16));
	}

	@Test
	void testP2Wins() {
		assertEquals(19, jack.play(15, 19));
	}
}
