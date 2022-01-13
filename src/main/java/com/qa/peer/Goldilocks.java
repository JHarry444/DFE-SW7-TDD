package com.qa.peer;

public class Goldilocks {

	private int weight;

	private int maxTemp;

	public Goldilocks(int weight, int maxTemp) {
		super();
		this.weight = weight;
		this.maxTemp = maxTemp;
	}

	public boolean checkPlace(Place p) {
		return this.getWeight() < p.getMaxWeight() && this.getMaxTemp() > p.getTemp();
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMaxTemp() {
		return this.maxTemp;
	}

	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}

}
