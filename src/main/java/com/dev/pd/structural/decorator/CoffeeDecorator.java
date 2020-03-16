package com.dev.pd.structural.decorator;

public class CoffeeDecorator implements Coffee {
	
	private Coffee coffee;
	
	public CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String makeCoffee() {
		return coffee.makeCoffee();
	}

	@Override
	public float getCost() {
		return coffee.getCost();
	}

}
