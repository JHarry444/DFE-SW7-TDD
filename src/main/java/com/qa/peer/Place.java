package com.qa.peer;

public class Place {

	private int maxWeight;

	private int temp;

	public Place(int maxWeight, int temp) {
		super();
		this.maxWeight = maxWeight;
		this.temp = temp;
	}

	public int getMaxWeight() {
		return this.maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public int getTemp() {
		return this.temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

}
