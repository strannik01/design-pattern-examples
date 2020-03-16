package com.dev.pd.structural.decorator;

public class DefaultCoffe implements Coffee {

	@Override
	public String makeCoffee() {
		return "Basic Coffee";
	}

	@Override
	public float getCost() {
		return new Float(7.5);
	}

}
