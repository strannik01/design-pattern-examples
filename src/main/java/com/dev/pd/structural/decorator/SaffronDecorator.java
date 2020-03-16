package com.dev.pd.structural.decorator;

public class SaffronDecorator extends CoffeeDecorator {

	public SaffronDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String makeCoffee() {
		return super.makeCoffee() + " " + SpiceType.SAFFRON.getDescription();
	}

	@Override
	public float getCost() {
		return super.getCost() + SpiceType.SAFFRON.getCost();
	}

}
