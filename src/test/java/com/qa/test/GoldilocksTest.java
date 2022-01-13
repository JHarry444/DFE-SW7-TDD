package com.qa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.qa.peer.BearNecessities;

public class GoldilocksTest {

	private BearNecessities bear = new BearNecessities();

	@Test
	void test123() {
		int goldiWeight = 40;
		int goldiMaxTemp = 35;

		String goldilocks = "" + goldiWeight + " " + goldiMaxTemp;

		List<String> input = List.of(goldilocks, "50 30", "60 20", "45 25", "30 40");

		assertEquals(List.of(1, 2, 3), bear.findSeats(input));

	}

	@Test
	void test234() {
		int goldiWeight = 30;
		int goldiMaxTemp = 45;

		String goldilocks = "" + goldiWeight + " " + goldiMaxTemp;

		List<String> input = List.of(goldilocks, "20 50", "40 20", "35 30", "50 20");

		assertEquals(List.of(2, 3, 4), bear.findSeats(input));

	}
}
