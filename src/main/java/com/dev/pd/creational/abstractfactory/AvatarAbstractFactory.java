package com.dev.pd.creational.abstractfactory;

public interface AvatarAbstractFactory {

	Warrior createWarrior(String name);

	Princess createPrincess(String name);

}
