package com.dev.pd.creational.abstractfactory;

public class GoodAvatarFactory implements AvatarAbstractFactory {

	@Override
	public Warrior createWarrior(String name) {
		return new GoodWarrior(name);
	}

	@Override
	public Princess createPrincess(String name) {
		return new GoodPrincess(name);
	}

}
