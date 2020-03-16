package com.dev.pd.structural.decorator;

public class VanillaDecorator extends CoffeeDecorator {

	public VanillaDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String makeCoffee() {
		return super.makeCoffee() + " " + SpiceType.VANILLA.getDescription();
	}

	@Override
	public float getCost() {
		return super.getCost() + SpiceType.VANILLA.getCost();
	}
	
	

}
