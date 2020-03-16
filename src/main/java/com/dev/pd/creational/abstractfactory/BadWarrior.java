package com.dev.pd.creational.abstractfactory;

public class BadWarrior implements Warrior {
	
	private String name;
	
	public BadWarrior(String name) {
		this.name = name;
	}
	
	@Override
	public void walk() {
		System.out.println(name + " esta avanzando");
	}


	@Override
	public void figth() {
		System.out.println(name + " golpea");
	}

	@Override
	public void changeArm(String arm) {
		System.out.println(name + " ha cambiado su arma a " + arm);
	}
	
	@Override
	public void collectArm(String nameArm) {
		System.out.println(name + " tiene una nueva arma " + nameArm);
	}

	@Override
	public void showArms() {
		// TODO Auto-generated method stub
		
	}

}
