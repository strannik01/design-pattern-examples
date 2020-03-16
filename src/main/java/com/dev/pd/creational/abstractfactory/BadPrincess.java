package com.dev.pd.creational.abstractfactory;

public class BadPrincess implements Princess {
	
	private String name;
	
	public BadPrincess(String name) {
		this.name = name;
	}

	@Override
	public void runaway() {
		System.out.println("Bad princess run away");
	}

	@Override
	public void kissTo(String warrior) {
		System.out.println("GoodPrincess" + name + " kiss to " + warrior);
	}

}
