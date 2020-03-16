package com.dev.pd.structural.decorator;

public class BrunetteSugarDecorator extends CoffeeDecorator {

	public BrunetteSugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String makeCoffee() {
		return super.makeCoffee() + " " + SugarType.BRUNETTE.getDescription();
	}

	@Override
	public float getCost() {
		return super.getCost() + SugarType.BRUNETTE.getCost();
	}
	
	

}
