package com.dev.pd.creational.abstractfactory;

public class GoodPrincess implements Princess {
	
	private String name;
	
	public GoodPrincess(String name) {
		this.name = name;
	}

	@Override
	public void runaway() {
		System.out.println("GoodPrincess run away " + name);
	}

	@Override
	public void kissTo(String warrior) {
		System.out.println("GoodPrincess" + name + " kiss to " + warrior);
	}

}
