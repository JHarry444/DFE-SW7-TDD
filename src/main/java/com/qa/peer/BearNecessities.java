package com.qa.peer;

import java.util.ArrayList;
import java.util.List;

public class BearNecessities {

	public List<Integer> findSeats(List<String> input) {
		List<Integer> seats = new ArrayList<>();
		int[] weightAndTemp = this.getWeightAndTemp(input.get(0));

		Goldilocks goldi = new Goldilocks(weightAndTemp[0], weightAndTemp[1]);

		for (int i = 1; i < input.size(); i++) {
			weightAndTemp = this.getWeightAndTemp(input.get(i));
			if (goldi.checkPlace(new Place(weightAndTemp[0], weightAndTemp[1]))) {
				seats.add(i);
			}
		}

		return seats;
	}

	public int[] getWeightAndTemp(String input) {
		String[] split = input.split(" ");
		return new int[] { Integer.parseInt(split[0]), Integer.parseInt(split[1]) };
	}

}
