package com.dev.pd.creational.abstractfactory;

public class BadAvatarFactory implements AvatarAbstractFactory {

	@Override
	public Warrior createWarrior(String name) {
		return new BadWarrior(name);
	}

	@Override
	public Princess createPrincess(String name) {
		return new BadPrincess(name);
	}
	
	

}
