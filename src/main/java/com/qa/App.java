package com.qa;

public class App {

	public static void main(String[] args) {
		long target = 1;
		for (int i = 1; i <= 4494; i++) {
			target *= i;
		}
		System.out.println(target);
	}

}
