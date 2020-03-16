package com.dev.pd.structural.decorator;

public class CinnamonDecorator extends CoffeeDecorator {

	public CinnamonDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String makeCoffee() {
		return super.makeCoffee() + " " + SpiceType.CINNAMON.getDescription();
	}

	@Override
	public float getCost() {
		return super.getCost() + SpiceType.CINNAMON.getCost();
	}
	
}
