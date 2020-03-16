package com.dev.pd.structural.decorator;

public class WhiteSugarDecorator extends CoffeeDecorator {

	public WhiteSugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String makeCoffee() {
		return super.makeCoffee() + " " + SugarType.WHITE.getDescription();
	}

	@Override
	public float getCost() {
		return super.getCost() + SugarType.WHITE.getCost(); 
	}
	
}
