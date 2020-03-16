package com.dev.pd.structural.decorator;

public class SweetenerDecorator extends CoffeeDecorator {

	public SweetenerDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String makeCoffee() {
		return super.makeCoffee() + " " + SugarType.SWEETENER.getDescription();
	}

	@Override
	public float getCost() {
		return super.getCost() + SugarType.SWEETENER.getCost();
	}
	
}
