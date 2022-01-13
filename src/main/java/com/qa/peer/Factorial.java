package com.qa.peer;

public class Factorial {

	public String reverseFactorial(float target) {
		int fact = 1;
		while (target > 1) {
			fact++;
			target /= fact;
		}
		if (target == 1) {
			return fact + "!";
		} else {
			return "NONE!";
		}
	}
}
